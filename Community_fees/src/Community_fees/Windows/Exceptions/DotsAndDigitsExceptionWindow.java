package Community_fees.Windows.Exceptions;

import javax.swing.*;
import java.awt.*;

public class DotsAndDigitsExceptionWindow {
    public DotsAndDigitsExceptionWindow() {
        JFrame warningFrm = new JFrame(" Warning!!! ");
        warningFrm.setLayout(new FlowLayout());
        warningFrm.setSize(300, 150);
        warningFrm.setResizable(false);
        warningFrm.setLocationRelativeTo(null);
        warningFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel text0 = new JLabel("FILL ALL FIELDS CORRECTLY!");
        JLabel text1 = new JLabel(" ------------------------------------------- ");
        JLabel text2 = new JLabel("Incorrect symbol. Use only DIGITS.");
        JLabel text3 = new JLabel("Use DOTS to separate decimal part.");
        warningFrm.add(text0);
        warningFrm.add(text1);
        warningFrm.add(text2);
        warningFrm.add(text3);
        warningFrm.setVisible(true);
    }
}