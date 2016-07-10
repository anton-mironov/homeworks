package Community_fees.Windows.Exceptions;

import javax.swing.*;
import java.awt.*;

public class AllExceptionWindow {
   public AllExceptionWindow() {
        JFrame warningFrm = new JFrame(" Warning!!! ");
        warningFrm.setLayout(new FlowLayout());
        warningFrm.setSize(300, 150);
        warningFrm.setResizable(false);
        warningFrm.setLocationRelativeTo(null);
        warningFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel text0 = new JLabel("FILL ALL FIELDS CORRECTLY!");
        JLabel text1 = new JLabel(" ------------------------------------------- ");
        JLabel text2 = new JLabel("All fields must be filled. Fill the blanks.");
        JLabel text3 = new JLabel("Use only INTEGERS to input indications of counters.");
        JLabel text4 = new JLabel("Use only DOTS to separate decimal part for money.");
        warningFrm.add(text0);
        warningFrm.add(text1);
        warningFrm.add(text2);
        warningFrm.add(text3);
        warningFrm.add(text4);
        warningFrm.setVisible(true);
    }
}