package com.company;

public class Homework4Ex3 {
    public static void main(String[] args) {
        int salary = 5555;
        if (salary > 0 && salary < 1000) {
            System.out.println("критически малый доход");
        } else if (salary < 5000) {
            System.out.println("средний доход");
        } else if (salary < 100000) {
            System.out.println("высокий доход");
        } else {
            System.out.println("миллионер");
        }
    }
}
