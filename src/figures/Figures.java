package figures;

 public abstract class Figures {

    protected String color;

    public Figures(String color) {
        this.color = color;
    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    // общий метод для вывода информации о фигуре
    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }

    }
