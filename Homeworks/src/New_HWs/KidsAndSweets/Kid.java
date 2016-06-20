package New_HWs.KidsAndSweets;

public class Kid {
    private String name;
    private Sweet localSweet;
    private int sex;
    private int preference;

    public String getName() {
        return name;
    }

    public Sweet getLocalSweet() {
        return localSweet;
    }

    public void setLocalSweet(Sweet localSweet) {
        this.localSweet = localSweet;
    }

    public int getSex() {
        return sex;
    }

    public int getPreference() {
        return preference;
    }

    public Kid(String name, int sex, int preference) {
        this.name = name;
        this.sex = sex;
        this.preference = preference;
    }

    @Override
    public String toString() {
        return name + " is eating " + localSweet.taste + " " + localSweet.name + ".";
    }
}