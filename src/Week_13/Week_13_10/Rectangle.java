package Week_13.Week_13_10;

import Week_13.Week_13_07.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this(width, height, "White", false);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    public int compareTo(GeometricObject o){
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() == o.getArea()) {
            return 0;
        }else {
            return 1;
        }
    }


}