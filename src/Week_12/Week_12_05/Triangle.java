package Week_12.Week_12_05;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        isValidTriangle(side1, side2, side3);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public void isValidTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the remaining side");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalArgumentException{
        if (side1 <= 0) {
            throw new IllegalArgumentException("Side must be greater than 0(zero)");
        } else {
            this.side1 = side1;
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2)throws IllegalArgumentException {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Side must be greater than 0(zero)");
        } else {
            this.side2 = side2;
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalArgumentException{
        if (side3 <= 0) {
            throw new IllegalArgumentException("Side must be greater than 0(zero)");
        } else {
            this.side3 = side3;
        }
    }
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}