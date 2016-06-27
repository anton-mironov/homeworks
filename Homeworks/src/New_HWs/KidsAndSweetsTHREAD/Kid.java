package New_HWs.KidsAndSweetsTHREAD;

public class Kid implements Runnable {
    private String name;
    private Sweet localSweet;
    private int sex;

    public Kid(Sweet localSweet) {
        this.localSweet = localSweet;
    }

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

    @Override
    public void run() {

//        try {
//            if (localSweet == null) {
//                wait();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}