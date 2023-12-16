package Week_10.Week_10_01;

public class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(){
        this(System.currentTimeMillis());

    }
    public Time(long milliseconds){
        this.hour=getHour(milliseconds);
        this.minute=getMinute(milliseconds);
        this.second=getSecond(milliseconds);

    }
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour(long milliseconds) {
        return (int) ((((milliseconds/60)/60)%24));
    }

    public int getMinute(long milliseconds) {
        return (int) ((milliseconds/60)%60);
    }

    public int getSecond(long milliseconds) {
        return (int) ((milliseconds%60));
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setTime(long elapsedTime){
        this.hour=(int) ((((elapsedTime/60)/60)%24));
        this.minute=(int) ((elapsedTime/60)%60);
        this.second=(int) ((elapsedTime%60));
    }
    public String toString(){
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }
}
