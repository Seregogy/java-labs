public class Distance {
    double x1, y1, x2, y2;

    public Distance(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calc() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    @Override
    public String toString() {
        return String.format("Расстояние между A(%.3f, %.3f) и B(%.3f, %.3f) = %.3f", x1, y1, x2, y2, calc());
    }
}
