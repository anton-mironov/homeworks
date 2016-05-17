package New_HWs.Delivery_Service;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChooseFrame extends JFrame {

    public ChooseFrame() {

        super("Starting and destination points");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 150));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        Font font = new Font("", Font.BOLD, 16);

        String[] cities = {"Kharkiv", "Kyiv", "Madrid", "New-York", "Deli", "Cairo", "Tokyo", "Havana", "Capetown", "Sydney"};
        String[] tTypes = {"Sea", "Ground", "Air", "Combo"};

        Container content = getContentPane();

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel("Select start and destination points");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        final String[] item1 = new String[1];
        final String[] item2 = new String[1];
        final String[] item3 = new String[1];

        ActionListener actionListener1 = e1 -> {
            JComboBox box1 = (JComboBox) e1.getSource();
            item1[0] = (String) box1.getSelectedItem();
            label.setText(item1[0] + " -- " + item2[0] + " through " + item3[0]);
        };

        ActionListener actionListener2 = e2 -> {
            JComboBox box2 = (JComboBox) e2.getSource();
            item2[0] = (String) box2.getSelectedItem();
            label.setText(item1[0] + " -- " + item2[0] + " through " + item3[0]);
        };

        JComboBox comboBox1 = new JComboBox(cities);
        comboBox1.setFont(font);
        comboBox1.setAlignmentX(LEFT_ALIGNMENT);
        comboBox1.addActionListener(actionListener1);
        String chosenCity1 = (String) comboBox1.getSelectedItem();
        content.add(comboBox1);

        JComboBox comboBox2 = new JComboBox(cities);
        comboBox2.setFont(font);
        comboBox2.setAlignmentX(LEFT_ALIGNMENT);
        comboBox2.addActionListener(actionListener2);
        String chosenCity2 = (String) comboBox2.getSelectedItem();
        content.add(comboBox2);

        ActionListener actionListener3 = e3 -> {
            JComboBox box3 = (JComboBox) e3.getSource();
            item3[0] = (String) box3.getSelectedItem();
            label.setText(item1[0] + " -- " + item2[0] + " through " + item3[0]);
        };

        JComboBox comboBox3 = new JComboBox(tTypes);
        comboBox3.setFont(font);
        comboBox3.setAlignmentX(LEFT_ALIGNMENT);
        comboBox3.addActionListener(actionListener3);
        String chosenTrType = (String) comboBox2.getSelectedItem();
        content.add(comboBox3);


        double s = TransportDetails.calcDistances(chosenCity1, chosenCity2);
        System.out.println("Details = " + s);

//        JComboBox ComboBox3 = new JComboBox(cities);
//        ComboBox3.setAlignmentX(LEFT_ALIGNMENT);
//        ComboBox3.setFont(font);
//        ComboBox3.addActionListener(actionListener);
//        content.add(ComboBox3);

    }
}