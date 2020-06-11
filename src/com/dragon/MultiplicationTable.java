package com.dragon;

/*
Динамическая таблица умножения.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число которое хотите умножать: ");
        int number = sc.nextInt();
        System.out.println("Введите число размерности вычисления: ");
        int size = sc.nextInt();
        System.out.println("Введите стартовое число с которого будет начинаться умножение: ");
        int startNumber = sc.nextInt();
        System.out.println("Введите шаг умножения: ");
        int step = sc.nextInt();

        System.out.println("Ваш результат: ");

        for (int i = number; i <= number; i += step) {
            for (int j = startNumber; j <= size; j += step) {
                System.out.println(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
}