package Week_14.Week_14_03;

public class Point implements Comparable {
    double x;
    double y;
    public Point(){
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
