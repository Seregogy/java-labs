package com.lab1;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Длина окружности: %.3f | Площадь: %.3f", getLength(), getArea());
    }
}
