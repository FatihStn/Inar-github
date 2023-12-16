package Week_13.Week_13_07;


public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter(){
        return side * 4;
    }

}