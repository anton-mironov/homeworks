package New_HWs.Practice10ForHW.impl;

public class Service implements New_HWs.Practice10ForHW.api.Service {
    private Country[] countries;
    private String[] states = {"","",""};

    public Service(Country[] countries) {
        this.countries = countries;
    }

    @Override
    public Long getCountryPopulation(String name) {
        for (Country country : countries)
            if (country.getName().equals(name))
                return country.getPopulation();
        return 0L;
    }

    @Override
    public Double getCountrySquare(String name) {
        for (Country country : countries)
            if (country.getName().equals(name))
                return country.getSquare();
        return 0d;
    }

    @Override
    public Double getTotalDensityOfPeople(String name) {
        for (Country country : countries)
            if (country.getName().equals(name))
                return country.getPopulation() / country.getSquare();
        return 0d;
    }

    @Override
    public Double getAverageDensityOfPeopleByStates(String name) {
        for (Country country : countries)
            if (country.getName().equals(name))
                return (country.getPopulation() / country.getSquare())/states.length;
        return 0d;
    }

    @Override
    public Country getOvercrowdedCountry() {
        double max = Double.MIN_VALUE;
        double currentCountry;
        Country count = null;
        for (Country country : countries) {
            currentCountry = country.getSquare() / country.getPopulation();
            if (currentCountry > max) {
                max = currentCountry;
                count = country;
            }
        }
        return count;
    }

    @Override
    public String getOvercrowdedState(String name) {
        Double density = Double.MIN_VALUE;
        String overCrowdedState = null;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getName().equals(name)) {
                for (int j = 0; j < countries[i].getStates().length; j++) {
                    if (density < countries[i].getStates()[j].getPopulation() / countries[i].getStates()[j].getSquare()) {
                        density = countries[i].getStates()[j].getPopulation() / countries[i].getStates()[j].getSquare();
                        overCrowdedState = countries[i].getStates()[j].getName();
                    }
                }
            }
        }
        return overCrowdedState;
    }

    @Override
    public String getBiggestState(String name) {
        String theBiggestState = null;
        Double biggestSquare = 0.0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getName().equals(name)) {
                for (int j = 0; j < countries[i].getStates().length; j++) {
                    if (biggestSquare < countries[i].getStates()[j].getSquare()) {
                        biggestSquare = countries[i].getStates()[j].getSquare();
                        theBiggestState = countries[i].getStates()[j].getName();
                    }
                }
            }
        }
        return theBiggestState;
    }
}
