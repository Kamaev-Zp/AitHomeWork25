package figures;

class   Diamond extends Figures {
    private double diagonal1;
    private double diagonal2;
    private double side;

    public  Diamond(String color, double diagonal1, double diagonal2, double side) {
        super(color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;


    }

    public double getArea() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
