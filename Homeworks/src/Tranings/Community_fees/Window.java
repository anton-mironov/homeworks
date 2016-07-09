package Tranings.Community_fees;

import Tranings.Community_fees.Calculators.*;

import javax.swing.*;
import java.awt.*;

public class Window {

    JToggleButton jtbnHotWater;
    private TextField elInit, elCurr, gasInit, gasCurr, waterInit, waterCurr, hotWaterInit, hotWaterCurr, mntTextField, heatTextField;
    private TextArea result;

    public Window() {
        JFrame jfrm = new JFrame("Communal fees calculator");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 520);
        jfrm.setLocationRelativeTo(null);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel header = new JLabel("        Please, enter indications of your counters   ");
        Label topOfTable = new Label(" Service               Initial            Current             Difference    ");
        JLabel elLab = new JLabel("Electricity: ");
        Label elDiff = new Label(" Not calculated ");
        JLabel gasLab = new JLabel("Gas:            ");
        Label gasDiff = new Label(" Not calculated ");
        JLabel waterLab = new JLabel("Water:        ");
        Label waterDiff = new Label(" Not calculated ");
        JLabel hotWaterLab = new JLabel("Hot water: ");
        Label hotWaterDiff = new Label(" Not calculated ");
        JLabel mntLab = new JLabel("Maintenance:                   ");
        Label mntDiff = new Label(" Not calculated ");
        JLabel heatLab = new JLabel("Heating:                            ");
        Label heatDiff = new Label(" Not calculated ");
        JLabel status = new JLabel("Waiting for inputs");

        elInit = new TextField(6);
        elInit.setText(String.valueOf(0));
        elCurr = new TextField(6);
        elCurr.setText(String.valueOf(0));
        gasInit = new TextField(6);
        gasInit.setText(String.valueOf(0));
        gasCurr = new TextField(6);
        gasCurr.setText(String.valueOf(0));
        waterInit = new TextField(6);
        waterInit.setText(String.valueOf(0));
        waterCurr = new TextField(6);
        waterCurr.setText(String.valueOf(0));
        hotWaterInit = new TextField(6);
        hotWaterInit.setText(String.valueOf(0));
        hotWaterCurr = new TextField(6);
        hotWaterCurr.setText(String.valueOf(0));
        mntTextField = new TextField(6);
        mntTextField.setText(String.valueOf(0));
        heatTextField = new TextField(6);
        heatTextField.setText(String.valueOf(0));

        JButton jbtnCalculate = new JButton("Calculate all services");
        JButton jbtnSaveToFile = new JButton("Save this bill as textfile");
        Button jbtnSetTariffs = new Button("Tarifs");

        jbtnCalculate.addActionListener(e -> {
            TotalCalculator totalCalculator = new TotalCalculator();
            try {
                calculateAll();
            } catch (Exception ex) {
                System.out.println("EXCEPTION!!! Fill all fields.");
            }
//            elDiff.setText("    " + String.valueOf(totalCalculator.calculateAll()) + " UAH  ");
        });

        jbtnSaveToFile.addActionListener(e -> {
            status.setText("Your information saved.");
        });

        jbtnSetTariffs.addActionListener(e -> {
            status.setText("Set tariffs.");
        });

        jfrm.add(header);
        jfrm.add(jbtnSetTariffs);
        jfrm.add(topOfTable);
        jfrm.add(elLab);
        jfrm.add(elInit);
        jfrm.add(elCurr);
        jfrm.add(elDiff);
        jfrm.add(gasLab);
        jfrm.add(gasInit);
        jfrm.add(gasCurr);
        jfrm.add(gasDiff);
        jfrm.add(waterLab);
        jfrm.add(waterInit);
        jfrm.add(waterCurr);
        jfrm.add(waterDiff);

        JCheckBox chboxIsUseHotWater = new JCheckBox(" Disable calculations for hot water supply (now ON) ");
        jfrm.add(chboxIsUseHotWater);
        chboxIsUseHotWater.addItemListener(ie -> {
            if (chboxIsUseHotWater.isSelected()) {
                chboxIsUseHotWater.setText(" Enable calculations for hot water supply (now OFF) ");
                hotWaterLab.setVisible(false);
                hotWaterInit.setVisible(false);
                hotWaterCurr.setVisible(false);
                hotWaterDiff.setVisible(false);
            } else {
                chboxIsUseHotWater.setText(" Disable calculations for hot water supply (now ON) ");
                hotWaterLab.setVisible(true);
                hotWaterInit.setVisible(true);
                hotWaterCurr.setVisible(true);
                hotWaterDiff.setVisible(true);
            }
        });
        jfrm.add(hotWaterLab);
        jfrm.add(hotWaterInit);
        jfrm.add(hotWaterCurr);
        jfrm.add(hotWaterDiff);

        jfrm.add(mntLab);
        jfrm.add(mntTextField);
        jfrm.add(mntDiff);

        JCheckBox chboxIsHeatingSeason = new JCheckBox(" Disable calculations for heating season (now ON) ");
        jfrm.add(chboxIsHeatingSeason);
        chboxIsHeatingSeason.addItemListener(ie -> {
            if (chboxIsHeatingSeason.isSelected()) {
                chboxIsHeatingSeason.setText(" Enable calculations for heating season (now OFF) ");
                heatLab.setVisible(false);
                heatTextField.setVisible(false);

                heatDiff.setVisible(false);
            } else {
                chboxIsHeatingSeason.setText(" Disable calculations for heating season (now ON) ");
                heatLab.setVisible(true);
                heatTextField.setVisible(true);

                heatDiff.setVisible(true);
            }
        });
        jfrm.add(heatLab);
        jfrm.add(heatTextField);

        jfrm.add(heatDiff);

        jfrm.add(jbtnCalculate);
        jfrm.add(jbtnSaveToFile);

        jfrm.add(status);

        result = new TextArea(("RESULT BILL WILL BE HERE" + "\n UAH  "), 7, 40);
        jfrm.add(result);
        jfrm.setVisible(true);
    }

    private void calculateAll() {
        ElectricityCalculator elCalc = new ElectricityCalculator();
        elCalc.calcElectricityPayment(extractor(elInit, elCurr));

        GasCalculator gasCalc = new GasCalculator();
        gasCalc.calcGasPayment(extractor(gasInit, gasCurr));

        WaterCalculator waterCalc = new WaterCalculator();
        waterCalc.calcWaterPayment(extractor(waterInit, waterCurr));

        WaterCalculator hotWaterCalc = new WaterCalculator();
        hotWaterCalc.calcWaterPayment((extractor(waterInit, waterCurr)), extractor(hotWaterInit, hotWaterCurr));

        MaintenanceCalculator mntCalc = new MaintenanceCalculator();
        mntCalc.calcMaintenancePayment(extractor(mntTextField));

        HeatingCalculator heatCalc = new HeatingCalculator();
        heatCalc.calcHeatingPayment(extractor(heatTextField));
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


//        jtbnHotWater = new JToggleButton("On/off");
//        jtbnHotWater.addItemListener(ie -> {
//            if (jtbnHotWater.isSelected()) jlab.setText("Button is ON.");
//            else jlab.setText("Button is OFF.");
//        });
//        jfrm.add(jtbnHotWater);