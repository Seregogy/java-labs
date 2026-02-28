package com.lab1;

public class Greeting {
    public void greet(String name, int age) {
        assert name.matches("\\d*") : "Невалидное имя";
        assert age >= 0 && age <= 120 : "Возраст в невалидном диапазоне";

        System.out.printf("Привет, %s! Через 5 лет тебе будет %d лет.%n", name, age + 5);
    }
}
