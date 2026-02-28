public class SumOfDigit {
    public int calc(int num) {
        assert num > 99 && num < 1000 : "Число выходит за границы диапазона";

        return (num % 10) + (num / 10 % 10) + (num / 100);
    }
}
