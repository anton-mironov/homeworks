package Practices_In_SYTOSS.Practices.Homework_No_4;

import Practices_In_SYTOSS.Practices.Homework_No_4.Editions.Edition;

import java.util.ArrayList;

public class Library {

    private ArrayList<Edition> library = new ArrayList<>();

    private static Library libraryInstance = new Library();

    public static Library getInstance() {
        return libraryInstance;
    }

    private Library() {
    }

    public void addEdition(Edition newEdition) {
        library.add(newEdition);
        System.out.println("You successfully added " + newEdition.getTitle() + " into the library!\n");
    }

    public String search(String query) {
        String result = "Nothing founded.";
        int count = 0;
        for (Edition edition : library) {

            if ((edition.getAuthor().toUpperCase().contains(query.toUpperCase())) | (edition.getTitle().toUpperCase().contains(query.toUpperCase()))) {
                count++;
                if (count == 1) {
                    System.out.println("Founded:");
                }
                result = "\t\t" + count + ") " + edition.getTitle() + " by " + edition.getAuthor();
            }
            System.out.println(result);
        }
        return result;
    }

    public void showAll() {
        System.out.print("All editions in library:");

        for (int i = 0; i < library.size(); i++) {
            System.out.print("\n" + (i + 1) + ") Author: " + library.get(i).getAuthor());
            System.out.print("\t\tTitle: " + library.get(i).getTitle());
            System.out.print("\t\tNo of pages: " + library.get(i).getNoOfPages()+"\n");
        }
    }
}