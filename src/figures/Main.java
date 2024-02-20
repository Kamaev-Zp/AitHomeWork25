package figures;

public class Main {
    public static void main(String[] args) {

                Figures[] figures = {
                        new Oval("yellow", 7, 54),
                        new Diamond("red", 3, 54, 22),
                        new Parallelogram("black", 5, 54, 43),
                        new Rectangle("white", 11, 44),
                        new Rhombus("Green", 44, 33)

                };
                for (Figures figures1 : figures){
                    figures1.printInfo();

            }
        }
    }
