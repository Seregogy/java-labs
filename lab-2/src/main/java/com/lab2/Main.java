package com.lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.print("Введите час: ");
        System.out.println(new TimeConverter(scanner.nextInt()));

        System.out.println("\nTask 2");
        System.out.print("Введите длину массива: ");
        System.out.println(new ArrayOp(scanner.nextInt()));
    }
}