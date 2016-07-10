package Tranings.Community_fees.Windows;

import Tranings.Community_fees.Tariffs;

import javax.swing.*;
import java.awt.*;

class TariffsWindow {
    private TextField elNormNewTar, el100NewTar, el600NewTar, gasNewTar, waterNewTar, hotWaterNewTar, sanitationNewTar;

    private Label elNormCurTar = new Label();
    private Label el100CurTar = new Label();
    private Label el600CurTar = new Label();
    private Label gasCurTar = new Label();
    private Label watCurTar = new Label();
    private Label hotWatCurTar = new Label();
    private Label sanitationCurTar = new Label();
    private JLabel status = new JLabel("No changes applied.");

    TariffsWindow() {
        JFrame trf = new JFrame(" Tariffs ");
        trf.setLayout(new FlowLayout());
        trf.setSize(320, 450);
        trf.setResizable(false);
        trf.setLocationRelativeTo(null);
        trf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        elNormNewTar = new TextField(5);
        el100NewTar = new TextField(5);
        el600NewTar = new TextField(5);
        gasNewTar = new TextField(5);
        waterNewTar = new TextField(5);
        hotWaterNewTar = new TextField(5);
        sanitationNewTar = new TextField(5);

        JButton applyChanges = new JButton("Apply changes");
        JButton restoreDefaults = new JButton("Restore defaults");

        setupAllValues();

        applyChanges.addActionListener(e -> {
            try {
                Tariffs.setNewTariffs(elNormNewTar.getText(), el100NewTar.getText(), el600NewTar.getText(), gasNewTar.getText(), waterNewTar.getText(), hotWaterNewTar.getText(), sanitationNewTar.getText());
                setupAllValues();
            } catch (Exception exc) {
                javax.swing.SwingUtilities.invokeLater(ExceptionWindow::new);
            }
            status.setText("Your changes will be used in next calculation.");
        });

        restoreDefaults.addActionListener(e -> {
            Tariffs.setDefaultTariffs();
            setupAllValues();
            status.setText("Default tariffs restored.");
        });

        JLabel header = new JLabel("        You can change values of tariffs manually        ");
        trf.add(header);
        Label topOfTable = new Label("  Service           Current          New                  Units         ");
        trf.add(topOfTable);

        JLabel elLab = new JLabel(" Electricity                                                                                 ");
        trf.add(elLab);
        String electricalUnits = " UAH per kW/hr";

        Label elNorm = new Label("below 100 ");
        trf.add(elNorm);
        trf.add(elNormCurTar);
        trf.add(elNormNewTar);
        Label elNormUnits = new Label(electricalUnits);
        trf.add(elNormUnits);

        Label el100 = new Label("100 -- 600 ");
        trf.add(el100);
        trf.add(el100CurTar);
        trf.add(el100NewTar);
        Label el100Units = new Label(electricalUnits);
        trf.add(el100Units);

        Label el600 = new Label("above 600 ");
        trf.add(el600);
        trf.add(el600CurTar);
        trf.add(el600NewTar);
        Label el600Units = new Label(electricalUnits);
        trf.add(el600Units);

        String separatorText = "   ____________________________________________";
        Label separator1 = new Label(separatorText);
        trf.add(separator1);

        JLabel gasLab = new JLabel("Town gas   ");
        String volumetricUnits = " UAH per m^3";

        trf.add(gasLab);
        trf.add(gasCurTar);
        trf.add(gasNewTar);
        Label gasUnits = new Label(volumetricUnits);
        trf.add(gasUnits);

        Label separator2 = new Label(separatorText);
        trf.add(separator2);

        JLabel waterLab = new JLabel("Cold water   ");
        trf.add(waterLab);
        trf.add(watCurTar);
        trf.add(waterNewTar);
        Label waterUnits = new Label(volumetricUnits);
        trf.add(waterUnits);

        JLabel hotWaterLab = new JLabel("Hot water   ");
        trf.add(hotWaterLab);
        trf.add(hotWatCurTar);
        trf.add(hotWaterNewTar);
        Label hotWaterUnits = new Label(volumetricUnits);
        trf.add(hotWaterUnits);

        JLabel sanitationLab = new JLabel("Sanitations");
        trf.add(sanitationLab);
        trf.add(sanitationCurTar);
        trf.add(sanitationNewTar);
        Label sanitationUnits = new Label(volumetricUnits);
        trf.add(sanitationUnits);

        Label separator3 = new Label(separatorText);
        trf.add(separator3);

        trf.add(applyChanges);
        trf.add(restoreDefaults);

        trf.add(status);

        trf.setVisible(true);
    }

    private void setupAllValues() {
        elNormCurTar.setText("   " + Tariffs.electricityTariffNorm + "   ");
        elNormNewTar.setText(String.valueOf(0));
        el100CurTar.setText("   " + Tariffs.electricityTariffOver100 + "   ");
        el100NewTar.setText(String.valueOf(0));
        el600CurTar.setText("   " + Tariffs.electricityTariffOver600 + "   ");
        el600NewTar.setText(String.valueOf(0));

        gasCurTar.setText("  " + Tariffs.gasTariff + "  ");
        gasNewTar.setText(String.valueOf(0));

        watCurTar.setText(" " + Tariffs.coldWaterSupplyTariff + "   ");
        waterNewTar.setText(String.valueOf(0));
        hotWatCurTar.setText("   " + Tariffs.hotWaterSupplyTariff + "   ");
        hotWaterNewTar.setText(String.valueOf(0));
        sanitationCurTar.setText("   " + Tariffs.sanitationTariff + "   ");
        sanitationNewTar.setText(String.valueOf(0));
    }
}