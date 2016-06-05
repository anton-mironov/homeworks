package Old_HWs.Delivery_Service;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String inputWeight = JOptionPane.showInputDialog("Please, enter the weight (in kgs) of your parcel");

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            new ChooseFrame(Integer.parseInt(inputWeight));
        });

    }
}