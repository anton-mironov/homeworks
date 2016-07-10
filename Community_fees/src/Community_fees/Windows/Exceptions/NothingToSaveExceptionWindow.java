package Community_fees.Windows.Exceptions;

import javax.swing.*;
import java.awt.*;

public class NothingToSaveExceptionWindow {
    public NothingToSaveExceptionWindow() {
        JFrame warningFrm = new JFrame(" Warning!!! ");
        warningFrm.setLayout(new FlowLayout());
        warningFrm.setSize(300, 150);
        warningFrm.setResizable(false);
        warningFrm.setLocationRelativeTo(null);
        warningFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel text0 = new JLabel("FILL ALL FIELDS CORRECTLY!");
        JLabel text1 = new JLabel(" ------------------------------------------- ");
        JLabel text2 = new JLabel("Nothing to save! Your file is empty.");
        warningFrm.add(text0);
        warningFrm.add(text1);
        warningFrm.add(text2);
        warningFrm.setVisible(true);
    }
}