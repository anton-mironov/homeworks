package New_HWs.Database;

public class Main {
    public static void main(String[] args) {

        DatabaseManager databaseManager = new DatabaseManager();

        databaseManager.add("Anna", 50);
        databaseManager.add("John", 10);
        databaseManager.add("Jane", 25);
        databaseManager.add("Jack", 15);
        databaseManager.add("George", 23);
        databaseManager.add("Joanna", 37);
        System.out.println("Filling database\t\t\t\t" + databaseManager.toString());

        databaseManager.remove("John");
        System.out.println("Removed by key\t\t\t\t\t" + databaseManager.toString());
        databaseManager.remove("Jane", 25);
        System.out.println("Removed by key & value\t\t\t" + databaseManager.toString());

        databaseManager.add("Mary", 35);
        databaseManager.add("Michael", 40);
        System.out.println("Refilling database\t\t\t\t" + databaseManager.toString());

        databaseManager.replace("Michael", 42);
        System.out.println("Replaced by key & value\t\t\t" + databaseManager.toString());
        databaseManager.replace("Mary", 35, 38);
        System.out.println("Replaced using new value\t\t" + databaseManager.toString());

        databaseManager.sort();
        System.out.println("Sorted by key\t\t\t\t\t" + databaseManager.toString());
        System.out.println("Sorted by value\t\t\t\t\t" + databaseManager.sortByValue().toString());
    }
}