package New_HWs.Tests;

public class Person {
    private Integer id;
    private String name;
    private Integer numberOfWins;
    private Integer gamePlayed;

    public Person(Integer id, String name, Integer numberOfWins, Integer gamePlayed) {
        this.id = id;
        this.name = name;
        this.numberOfWins = numberOfWins;
        this.gamePlayed = gamePlayed;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getNumberOfWins() {
        return numberOfWins;
    }

    public double getPercentOfLoses() {
        return (double)(this.gamePlayed-this.numberOfWins)/100;
    }

    public Person setNumberOfWins(Integer numberOfWins) {
        this.numberOfWins = numberOfWins;
        return this;
    }

    public Integer getGamePlayed() {
        return gamePlayed;
    }

    public Person setGamePlayed(Integer gamePlayed) {
        this.gamePlayed = gamePlayed;
        return this;
    }
}