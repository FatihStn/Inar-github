package Week_10.Week_10_10;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <= 20 ; i++) {
            queue.enQueue(i);
        }
        queue.disPlayTheElements();
    }
}