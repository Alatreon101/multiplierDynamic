package com.dragon;

/*
Динамическая таблица умножения.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int size = sc.nextInt();

        for (int i = number; i <= number; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.println(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }

    }
}