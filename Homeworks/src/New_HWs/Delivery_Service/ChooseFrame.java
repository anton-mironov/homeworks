package New_HWs.Delivery_Service;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChooseFrame extends JFrame {

    public ChooseFrame(int inputWeight) {

        super("Starting and destination points");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 150));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        Font font = new Font("", Font.BOLD, 16);

        String[] cities = {"Kharkiv", "Kyiv", "Madrid", "New-York", "Deli", "Cairo", "Tokyo", "Havana", "Capetown", "Sydney"};
        TransportType[] tTypes = {TransportType.GROUND, TransportType.AIR, TransportType.SEA, TransportType.COMBO};

        Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel("Select start and destination points");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        final String[] chosenCity1 = {"Kharkiv"};
        final String[] chosenCity2 = {"Kharkiv"};
        final TransportType[] defaultTransportType = new TransportType[]{TransportType.GROUND};

        ActionListener actionListener1 = e1 -> {
            JComboBox box1 = (JComboBox) e1.getSource();
            chosenCity1[0] = (String) box1.getSelectedItem();
            label.setText(chosenCity1[0] + " -- " + chosenCity2[0] + " through " + defaultTransportType[0]);
            setupTransportDetails(inputWeight, defaultTransportType[0], chosenCity1[0], chosenCity2[0]);
        };

        ActionListener actionListener2 = e2 -> {
            JComboBox box2 = (JComboBox) e2.getSource();
            chosenCity2[0] = (String) box2.getSelectedItem();
            label.setText(chosenCity1[0] + " -- " + chosenCity2[0] + " through " + defaultTransportType[0]);
            setupTransportDetails(inputWeight, defaultTransportType[0], chosenCity1[0], chosenCity2[0]);
        };

        ActionListener actionListener3 = e3 -> {
            JComboBox box3 = (JComboBox) e3.getSource();
            defaultTransportType[0] = (TransportType) box3.getSelectedItem();
            label.setText(chosenCity1[0] + " -- " + chosenCity2[0] + " through " + defaultTransportType[0]);
            setupTransportDetails(inputWeight, defaultTransportType[0], chosenCity1[0], chosenCity2[0]);
        };

        JComboBox comboBox1 = new JComboBox(cities);
        comboBox1.setFont(font);
        comboBox1.setAlignmentX(LEFT_ALIGNMENT);
        comboBox1.addActionListener(actionListener1);
        content.add(comboBox1);

        JComboBox comboBox2 = new JComboBox(cities);
        comboBox2.setFont(font);
        comboBox2.setAlignmentX(LEFT_ALIGNMENT);
        comboBox2.addActionListener(actionListener2);
        content.add(comboBox2);

        JComboBox comboBox3 = new JComboBox(tTypes);
        comboBox3.setFont(font);
        comboBox3.setAlignmentX(LEFT_ALIGNMENT);
        comboBox3.addActionListener(actionListener3);
        content.add(comboBox3);
    }

    private void setupTransportDetails(int inputWeight, TransportType chosenTransportType, String chosenCity1, String chosenCity2) {
        TransportDetails transportDetails = new TransportDetails();
        transportDetails.setWeight(inputWeight);
        System.out.println("\nFrom " + chosenCity1 + " to " + chosenCity2 + " through " + chosenTransportType + " transport.\n" + transportDetails.transportationParameters(chosenTransportType, chosenCity1, chosenCity2));
    }
}