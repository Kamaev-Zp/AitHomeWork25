package figures;

 class Rhombus extends Figures {
    private double side;
    private double angle; // Угол в радианах

    public Rhombus( String color ,double side, double angle) {
        super(color);
        this.side = side;
        this.angle = angle;
    }

    public double getArea() {
        return side * side * Math.sin(angle);
    }

    public double getPerimeter() {
        return 4 * side;
    }
}


