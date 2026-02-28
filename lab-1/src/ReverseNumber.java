public class ReverseNumber {
    int num;

    public ReverseNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(((num % 10) * 100) + ((num / 10 % 10) * 10) + (num / 100));
    }
}
