package Week_09.Week_09_02;

public class Question_09_02 {
    public static void main (String[]args){
        Stock stock = new Stock(34.35);
    }
}
class Stock{
    String symbol="ORC";
    String name="Oracle Coorperation";
    double previousClosingPrice=34.5;
    double currentPrice=1;
    Stock(){

    }
    Stock(double newCurrentPrice){
        currentPrice=newCurrentPrice;
    }
    double getChangePercent(){

        return 100-((100*currentPrice)/(previousClosingPrice));
    }


}
