package New_HWs.Delivery_Service;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String inputWeight = JOptionPane.showInputDialog("Please, enter the weight (in kgs) of your parcel");

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            new ChooseFrame();
        });

        TransportDetails transportDetails = new TransportDetails();
        transportDetails.setWeight(Integer.parseInt(inputWeight));

        System.out.println("SEA:\n" + transportDetails.transportationParameters(TransportType.SEA));
        System.out.println("\nAIR:\n" + transportDetails.transportationParameters(TransportType.AIR));
        System.out.println("\nGROUND:\n" + transportDetails.transportationParameters(TransportType.GROUND));
        System.out.println("\nCOMBO:\n" + transportDetails.transportationParameters(TransportType.COMBO) + "\n");
    }
}