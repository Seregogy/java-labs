public class TimeFormat {
    int minutes;

    public TimeFormat(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return String.format("%d ч. %d мин.", minutes / 60, minutes % 60);
    }
}
