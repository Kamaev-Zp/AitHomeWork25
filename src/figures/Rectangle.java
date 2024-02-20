package figures;

class Rectangle extends  Figures {
    private double length;
    private double width;

    public Rectangle( String color ,double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}




//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(String color, double radius) {
//        super(color);
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//
//class Square extends Shape {
//    private double side;
//
//    public Square(String color, double side) {
//        super(color);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }
//}
//
//
//class Main {
//    public static void main(String[] args) {
//        Shape[] shapes = {
//                new Circle("yellow", 7),
//                new Square("red", 3),
//                new Circle("black", 5),
//                new Square("white", 11)
//        };
//
//        for (Shape shape : shapes) {
//            shape.printInfo();
//            System.out.println();
//        }
//    }
//}