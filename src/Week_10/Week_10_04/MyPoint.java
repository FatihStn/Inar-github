package Week_10.Week_10_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint (){
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(MyPoint myPoint){
        return distance(myPoint.getX(),myPoint.getY());
    }
    public double distance(double x1,double y1){
        return Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
    }
}
