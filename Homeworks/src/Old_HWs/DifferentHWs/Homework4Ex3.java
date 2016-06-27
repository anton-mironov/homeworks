package Old_HWs.DifferentHWs;

public class Homework4Ex3 {
    public static void exercise4_3() {
        int salary = 5555;
        if (salary > 0 && salary < 1000) {
            System.out.println("Зарплата в " + salary + " грн - это критически малый доход");
        } else if (salary < 5000) {
            System.out.println("Зарплата в " + salary + " грн - это средний доход");
        } else if (salary < 100000) {
            System.out.println("Зарплата в " + salary + " грн - это высокий доход");
        } else {
            System.out.println("Если Ваша зарплата составляет " + salary + " грн, то Вы миллионер!");
        }
    }
}
