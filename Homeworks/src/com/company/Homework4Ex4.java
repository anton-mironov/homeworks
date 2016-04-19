package com.company;

import java.util.*;

public class Homework4Ex4 {
    public static void main(String[] args) {
        System.out.println("Выберете любое задание и введите его номер.");
        System.out.println("Задание 1. Собрать в одну сроку...");
        System.out.println("Задание 2. Преобразовать число в формулу...");
        System.out.println("Задание 3. Отобразить уровень доходов...");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Вы выбрали задание №1 \nЕго результат:");
                    Homework4Ex1.exercise4_1();
                    break;
                case 2:
                    System.out.println("Вы выбрали задание №2 \nЕго результат:");
                    Homework4Ex2.exercise4_2();
                    break;
                case 3:
                    System.out.println("Вы выбрали задание №3 \nЕго результат:");
                    Homework4Ex3.exercise4_3();
                    break;
                default:
                    System.out.println("Введите корректное число");
                    break;
            }
        }
        scanner.close();
    }
}

