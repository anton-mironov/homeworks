package Community_fees.Windows;

import Community_fees.Calculators.*;
import Community_fees.Windows.Exceptions.AllExceptionWindow;
import Community_fees.Windows.Exceptions.NothingToSaveExceptionWindow;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.DateFormat;
import java.util.Date;

public class MainWindow {
    private TextField elInit, elCurr, gasInit, gasCurr, waterInit, waterCurr, hotWaterInit, hotWaterCurr, mntTextField, heatTextField;
    private TextArea result;

    private Label elDiff = new Label(" Not calculated ");
    private Label gasDiff = new Label(" Not calculated ");
    private Label waterDiff = new Label(" Not calculated ");
    private Label hotWaterDiff = new Label(" Not calculated ");
    private Label mntDiff = new Label(" Not calculated ");
    private Label heatDiff = new Label(" Not calculated ");

    private JLabel status = new JLabel("Waiting for inputs");

    public MainWindow() {
        JFrame jfrm = new JFrame(" Communal fees calculator ");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 520);
        jfrm.setResizable(false);
        jfrm.setLocationRelativeTo(null);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String empty = null;

        elInit = new TextField(6);
        elInit.setText(empty);
        elCurr = new TextField(6);
        elCurr.setText(empty);

        gasInit = new TextField(6);
        gasInit.setText(empty);
        gasCurr = new TextField(6);
        gasCurr.setText(empty);

        waterInit = new TextField(6);
        waterInit.setText(empty);
        waterCurr = new TextField(6);
        waterCurr.setText(empty);

        hotWaterInit = new TextField(6);
        hotWaterInit.setText(String.valueOf(0));
        hotWaterCurr = new TextField(6);
        hotWaterCurr.setText(String.valueOf(0));

        mntTextField = new TextField(6);
        mntTextField.setText(empty);

        heatTextField = new TextField(6);
        heatTextField.setText(String.valueOf(0));

        Button jbtnSetTariffs = new Button("Tariffs");
        JButton jbtnCalculate = new JButton("Calculate all services");
        JButton jbtnSaveToFile = new JButton("Save this bill on desktop");

        jbtnSetTariffs.addActionListener(e -> {
            javax.swing.SwingUtilities.invokeLater(TariffsWindow::new);
        });

        jbtnCalculate.addActionListener(e -> {
            try {
                calculateButton();
            } catch (NumberFormatException nFex) {
                javax.swing.SwingUtilities.invokeLater(AllExceptionWindow::new);
            }
            status.setText("Calculated.");
        });

        jbtnSaveToFile.addActionListener(e -> {
            saveToFile();
            status.setText("Results of calculations saved.");
        });


        JLabel header = new JLabel("        Please, enter indications of your counters   ");
        jfrm.add(header);
        jfrm.add(jbtnSetTariffs);

        Label topOfTable = new Label(" Service               Initial            Current             Difference    ");
        jfrm.add(topOfTable);

        JLabel elLab = new JLabel("Electricity: ");
        jfrm.add(elLab);
        jfrm.add(elInit);
        jfrm.add(elCurr);
        jfrm.add(elDiff);

        JLabel gasLab = new JLabel("Town gas: ");
        jfrm.add(gasLab);
        jfrm.add(gasInit);
        jfrm.add(gasCurr);
        jfrm.add(gasDiff);

        JLabel waterLab = new JLabel("Water:        ");
        jfrm.add(waterLab);
        jfrm.add(waterInit);
        jfrm.add(waterCurr);
        jfrm.add(waterDiff);

        JCheckBox chboxIsUseHotWater = new JCheckBox(" Enable calculations for hot water supply (now OFF) ");
        jfrm.add(chboxIsUseHotWater);

        JLabel hotWaterLab = new JLabel("Hot water: ");
        jfrm.add(hotWaterLab);
        jfrm.add(hotWaterInit);
        jfrm.add(hotWaterCurr);
        jfrm.add(hotWaterDiff);

        hotWaterLab.setVisible(false);
        hotWaterInit.setVisible(false);
        hotWaterCurr.setVisible(false);
        hotWaterDiff.setVisible(false);

        chboxIsUseHotWater.addItemListener(ie -> {
            if (chboxIsUseHotWater.isSelected()) {
                chboxIsUseHotWater.setText(" Disable calculations for hot water supply (now ON) ");
                hotWaterLab.setVisible(true);
                hotWaterInit.setVisible(true);
                hotWaterCurr.setVisible(true);
                hotWaterDiff.setVisible(true);
            } else {
                chboxIsUseHotWater.setText(" Enable calculations for hot water supply (now OFF) ");
                hotWaterLab.setVisible(false);
                hotWaterInit.setVisible(false);
                hotWaterCurr.setVisible(false);
                hotWaterDiff.setVisible(false);
                hotWaterInit.setText(String.valueOf(0));
                hotWaterCurr.setText(String.valueOf(0));
            }
        });

        jfrm.add(hotWaterLab);
        jfrm.add(hotWaterInit);
        jfrm.add(hotWaterCurr);
        jfrm.add(hotWaterDiff);

        JLabel mntLab = new JLabel("Maintenance:                   ");
        jfrm.add(mntLab);
        jfrm.add(mntTextField);
        jfrm.add(mntDiff);

        JCheckBox chboxIsHeatingSeason = new JCheckBox(" Enable calculations for heating season (now OFF) ");
        jfrm.add(chboxIsHeatingSeason);

        JLabel heatLab = new JLabel("Heating:                             ");
        jfrm.add(heatLab);
        jfrm.add(heatTextField);
        jfrm.add(heatDiff);

        heatLab.setVisible(false);
        heatTextField.setVisible(false);
        heatDiff.setVisible(false);

        chboxIsHeatingSeason.addItemListener(ie -> {
            if (chboxIsHeatingSeason.isSelected()) {
                chboxIsHeatingSeason.setText(" Disable calculations for heating season (now ON) ");
                heatLab.setVisible(true);
                heatTextField.setVisible(true);
                heatDiff.setVisible(true);
            } else {
                chboxIsHeatingSeason.setText(" Enable calculations for heating season (now OFF) ");
                heatLab.setVisible(false);
                heatTextField.setVisible(false);
                heatDiff.setVisible(false);
                heatTextField.setText(String.valueOf(0));
            }
        });

        jfrm.add(jbtnCalculate);
        jfrm.add(jbtnSaveToFile);

        jfrm.add(status);

        result = new TextArea(("\n\n\n              Results of calculations will be here "), 8, 40);
        jfrm.add(result);

        jfrm.setVisible(true);
    }

    private void saveToFile() {
        Date dateAndTime = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        String fullTime = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(dateAndTime);
        String fullDate = dateFormat.format(dateAndTime);

        String fileName = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Community fees bill (" + fullDate + ").txt";
        File file = new File(fileName);
        PrintWriter input = null;

        try {
            input = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            status.setText("Something went wrong...");
        }

        try {
            input.write("This file was created at " + fullTime + ", " + fullDate + "\n\n" + calculateButton());
        } catch (Exception ex) {
            javax.swing.SwingUtilities.invokeLater(NothingToSaveExceptionWindow::new);
        }
        input.close();
    }

    private String calculateButton() {
        int el = extractor(elInit, elCurr);
        int gas = extractor(gasInit, gasCurr);
        int wat = extractor(waterInit, waterCurr);
        int hotWat = extractor(hotWaterInit, hotWaterCurr);
        double mnt = extractor(mntTextField);
        double heat = extractor(heatTextField);

        elDiff.setText("            " + el + "            ");
        gasDiff.setText("            " + gas + "            ");
        waterDiff.setText("            " + wat + "            ");
        hotWaterDiff.setText("               " + hotWat + "          ");
        mntDiff.setText("          " + mnt + " UAH   ");
        heatDiff.setText("          " + heat + " UAH   ");

        TotalCalculator totalCalc = new TotalCalculator();
        String totalBill = totalCalc.createTotalBill(el, gas, wat, hotWat, heat, mnt);
        result.setText(String.valueOf(totalBill));
        return totalBill;
    }

    private int extractor(TextField textField1, TextField textField2) {
        int field1 = Integer.parseInt(textField1.getText());
        int field2 = Integer.parseInt(textField2.getText());
        return field2 - field1;
    }

    private double extractor(TextField textField) {
        return Double.parseDouble(textField.getText());
    }
}