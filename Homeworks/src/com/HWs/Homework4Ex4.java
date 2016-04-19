package com.HWs;

import java.util.*;

public class Homework4Ex4 {
    public static void main(String[] args) {
        System.out.println("Выберете любое задание и введите его номер.");
        System.out.println("Для возврата в это меню, введите цифру 0 \n");
        System.out.println("Задание 1. Создать...");
        System.out.println("Задание 2. Найти...");
        System.out.println("Задание 3. Вычислить...");
                                                            //после выполнения какого-то кейса ПО УМОЛЧАНИЮ вернуться в начальное меню
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();
        scanner.close();

        switch (menuChoice) {
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
            case 0:
                System.out.println("Возврат в главное меню");
                // тут нужно перенестись снова к выбору задания
            default:
                System.out.println("Введите корректное число");
                // тут нужно перенестись снова к выбору задания
        }
    }
}
