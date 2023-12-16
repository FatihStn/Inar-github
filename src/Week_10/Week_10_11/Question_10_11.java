package Week_10.Week_10_11;

public class Question_10_11 {
    public static void main(String[] args) {
        Circle circle2D = new Circle(2,2,5.5);
        System.out.println("Circle1 area: " + circle2D.getArea() + "\nCircle1 perimeter: " + circle2D.getPerimeter());
        System.out.println("Does circle1 contain the point (3, 3) ? --> " + circle2D.contains(3,3));
        System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5 ? --> " + circle2D.contains(new Circle(4,5,10.5)));
        System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3 ? --> " + circle2D.overlaps(new Circle(3,5,2.3)));
    }
}