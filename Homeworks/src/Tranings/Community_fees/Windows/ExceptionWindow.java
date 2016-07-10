package Tranings.Community_fees.Windows;

import javax.swing.*;
import java.awt.*;

class ExceptionWindow {
    ExceptionWindow() {
        JFrame warningFrm = new JFrame(" Warning!!! ");
        warningFrm.setLayout(new FlowLayout());
        warningFrm.setSize(250, 150);
        warningFrm.setResizable(false);
        warningFrm.setLocationRelativeTo(null);
        warningFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel text0 = new JLabel(" FILL ALL FIELDS CORRECTLY!");
        JLabel text1 = new JLabel(" ----------------------------------- ");
        JLabel text2 = new JLabel("Use only digits and");
        JLabel text3 = new JLabel("separate decimal part with dots (\" . \")");
        warningFrm.add(text0);
        warningFrm.add(text1);
        warningFrm.add(text2);
        warningFrm.add(text3);
        warningFrm.setVisible(true);
    }
}