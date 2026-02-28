package com.lab2;

public class TimeConverter {
    int time;

    public TimeConverter(int time) {
        assert time < 0 : "aaa";
        this.time = time;
    }

    private String convert() {
        return switch (time) {
            case 0, 1, 2, 3, 4, 5 -> "Ночь";
            case 6, 7, 8, 9, 10, 11 -> "Утро";
            case 12, 13, 14, 15, 16 -> "День";
            case 18, 19, 20, 21, 22, 23 -> "Вечер";
            default -> "Неизвестное время";
        };
    }

    @Override
    public String toString() {
        return convert();
    }
}
