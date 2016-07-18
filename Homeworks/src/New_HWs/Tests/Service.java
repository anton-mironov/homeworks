package New_HWs.Tests;

public class Service {
    private DB db;

    public Service(DB db) {
        this.db = db;
    }

    public Double getPersonScore(String name) {
        Person person = db.getByName(name);
        return ((double) person.getNumberOfWins()) / person.getGamePlayed();
    }

    public Integer getPersonWins(Integer id) {
        return db.getById(id).getNumberOfWins();
    }

    public double getPercentOfPersonLoses(Integer id) {
        return db.getById(id).getPercentOfLoses();
    }
}