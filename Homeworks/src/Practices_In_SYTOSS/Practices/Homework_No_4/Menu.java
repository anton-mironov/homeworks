package Practices_In_SYTOSS.Practices.Homework_No_4;

import Practices_In_SYTOSS.Practices.Homework_No_4.Editions.Book;
import Practices_In_SYTOSS.Practices.Homework_No_4.Editions.Edition;
import Practices_In_SYTOSS.Practices.Homework_No_4.Editions.Magazine;

import java.util.Scanner;

public class Menu {

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, select one of the options:\n" +
                "Press 1 - to add a new edition to the library;\n" +
                "Press 2 - to search edition with the author name or title;\n" +
                "Press 3 - to show all existing edition;\n" +
                "Press any LETTER key to quit.");

        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {

                case 1:
                    showTypeMenu(scanner);
                    break;

                case 2:
                    System.out.println("Enter any part of name or title:");
                    scanner.nextLine();

                    Library.getInstance().search(scanner.nextLine());
                    showMainMenu();
                    break;

                case 3:
                    Library.getInstance().showAll();
                    showMainMenu();
                    break;
            }
        }
        scanner.close();
    }

    private void showTypeMenu(Scanner scanner) {
        Library library = Library.getInstance();

        System.out.println("Which type of edition do you want to add?\n" +
                "1 - new book;\n" +
                "2 - new magazine;\n" +
                "0 - back to main menu.");

        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {

                case 1:
                    library.addEdition(createNewEdition(scanner, 1));
                    showMainMenu();
                    break;

                case 2:
                    library.addEdition(createNewEdition(scanner, 2));
                    showMainMenu();
                    break;

                case 0:
                    showMainMenu();
                    break;
            }
        }
    }

    private Edition createNewEdition(Scanner scanner, int editionType) {

        scanner.nextLine();

        Edition localEdition = null;

        System.out.println("Please, enter the name of author:");
        String author = scanner.nextLine();

        System.out.println("Please, enter the title of your edition:");
        String title = scanner.nextLine();

        System.out.println("Please, enter the number of pages in your edition:");
        int noOfPages = scanner.nextInt();

        if (editionType == 1) {
            localEdition = new Book(author, title, noOfPages);
        } else if (editionType == 2) {
            localEdition = new Magazine(author, title, noOfPages);
        }
        return localEdition;
    }
}