package New_HWs.SimpleGame;

import New_HWs.SimpleGame.api.service.Service;
import New_HWs.SimpleGame.impl.service.ServiceImpl;

public class Main {

    public static void main(String[] args) {

        Service gameService = new ServiceImpl();

        for (int i = 1; i <= 5; i++) {
            System.out.println("\t\t\t\t\t\tIteration " + i);
            gameService.nextIteration();
        }
    }
}