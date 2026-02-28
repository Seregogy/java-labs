package com.lab1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("src/main/resources/temp.txt")) {
            Scanner scanner = new Scanner(fileInputStream);

            System.out.println("Task 1");
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();

            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();
            new Greeting().greet(name, age);

            System.out.println("\nTask 2");

            System.out.print("Введите C°: ");
            ConverterDemo converterDemo = new ConverterDemo(scanner.nextFloat());
            converterDemo.convert(new Fahrenheit());
            converterDemo.convert(new Kelvin());

            System.out.println("\nTask 3");
            System.out.print("Введите 2 числа: ");
            new Arithmetics().doArithmetics(scanner.nextInt(), scanner.nextInt());

            System.out.println("\nTask 4");
            System.out.println("Введите трехзначное число: ");
            System.out.println(new SumOfDigit().calc(scanner.nextInt()));

            System.out.println("\nTask 5");
            System.out.println("Введите радиус: ");
            System.out.println(new Circle(scanner.nextFloat()));

            System.out.println("\nTask 6");
            System.out.println("Введите координаты точки A: ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            System.out.println("Введите координаты точки B: ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            System.out.println(new Distance(x1, y1, x2, y2));

            System.out.println("\nTask 7");
            System.out.println("Введите минуты: ");
            System.out.println(new TimeFormat(scanner.nextInt()));

            System.out.println("\nTask 8");
            System.out.println("Введите трехзначное число: ");
            System.out.println(new ReverseNumber(scanner.nextInt()));
        } catch (IOException _) { }
    }
}