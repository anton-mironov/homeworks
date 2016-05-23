package Old_HWs.Practice10ForHW;

import Old_HWs.Practice10ForHW.impl.*;

public class MainCS {
    public static void main(String[] args) {

        State[] statesForUkraine = {
                new State(2804000, 839d, "Kiev"),
                new State(1431000, 310d, "Kharkov"),
                new State(723605, 182d, "Lvov")
        };

        State[] statesForBelarus = {
                new State(1893000, 307d, "Minsk"),
                new State(323674, 145d, "Brest"),
                new State(82547, 41d, "Polotsk")
        };

        State[] statesForUSA = {
                new State(26960000, 396241d, "Texas"),
                new State(11590000, 116096d, "Ohio"),
                new State(38800000, 423970d, "California")
        };

        Country[] countries = {
                new Country("Ukraine", statesForUkraine),
                new Country("Belarus", statesForBelarus),
                new Country("USA", statesForUSA)
        };

        Service sv = new Service(countries);

        System.out.println("(3 states in)\t\tPopulaton\t\t\tSquare\t\t\t\tDensity\t\t\tOvercr. state\tBiggest state\tAverage density");

        System.out.println("Ukraine:\t\t" + sv.getCountryPopulation("Ukraine") + " people\t\t" + sv.getCountrySquare("Ukraine") + " sq. kms\t\t" + sv.getTotalDensityOfPeople("Ukraine")
                + "\t" + sv.getOvercrowdedState("Ukraine") + "\t\t\t" + sv.getBiggestState("Ukraine") + "\t\t\t" + sv.getAverageDensityOfPeopleByStates("Ukraine"));

        System.out.println("Belarus:\t\t" + sv.getCountryPopulation("Belarus") + " people\t\t" + sv.getCountrySquare("Belarus") + " sq. kms\t\t" + sv.getTotalDensityOfPeople("Belarus")
                + "\t" + sv.getOvercrowdedState("Belarus") + "\t\t\t" + sv.getBiggestState("Belarus") + "\t\t\t" + sv.getAverageDensityOfPeopleByStates("Belarus"));

        System.out.println("USA:\t\t\t" + sv.getCountryPopulation("USA") + " people\t\t" + sv.getCountrySquare("USA") + " sq. kms\t" + sv.getTotalDensityOfPeople("USA")
                + "\t" + sv.getOvercrowdedState("USA") + "\t\t\t" + sv.getBiggestState("USA") + "\t\t" + sv.getAverageDensityOfPeopleByStates("USA"));

        System.out.println("\nThe most overcrowded country is " + sv.getOvercrowdedCountry().getName());
    }
}