package New_HWs.Practice10ForHW.impl;

public class Country implements New_HWs.Practice10ForHW.api.Country {
    private String name;
    private State[] states;
    private Long population = 0l;
    private Double square = 0d;

    public Country(String name, State[] states) {
        this.name = name;
        this.states = states;
        for (State st : states) {
            population += st.getPopulation();
            square += st.getSquare();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getPopulation() {
        return population;
    }

    @Override
    public Double getSquare() {
        return square;
    }

    @Override
    public State[] getStates() {
        return states;
    }
}
