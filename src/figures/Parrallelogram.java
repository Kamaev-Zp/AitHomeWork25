package figures;

class Parallelogram extends Figures {
    private double base;
    private double height;
    private double side;

    public Parallelogram( String color, double base, double height, double side) {
        super(color);
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * (base + side);
    }
}

