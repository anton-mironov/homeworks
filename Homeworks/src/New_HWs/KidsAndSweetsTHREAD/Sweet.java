package New_HWs.KidsAndSweetsTHREAD;

public class Sweet {

    public String name;
    public String taste;
    public long timeStamp;

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public Sweet(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }
}