package figures;

class Oval extends Figures {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Oval( String color, double semiMajorAxis, double semiMinorAxis) {
        super(color);
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    public double getPerimeter() {
        // Формула для приближенного вычисления периметра овала: 2π √(a² + b²/2)
        double a = semiMajorAxis;
        double b = semiMinorAxis;
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }
}
