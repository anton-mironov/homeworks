package New_HWs.Practice10ForHW.impl;


public class State implements New_HWs.Practice10ForHW.api.State {

    private long population;
    private Double square;
    private String name;

    public State(long population, Double square, String name) {
        this.population = population;
        this.name = name;
        this.square = square;
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
    public String getName() {
        return name;
    }
}