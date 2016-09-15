package Practices_In_SYTOSS.Practices.Homework_No_4.Editions;

public abstract class Edition {

    private String author;
    private String title;
    private int noOfPages;

    public Edition(String author, String title, int noOfPages) {
        this.author = author;
        this.title = title;
        this.noOfPages = noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}