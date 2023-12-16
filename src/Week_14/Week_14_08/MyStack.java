package Week_14.Week_14_08;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyStack<E> {
    private Queue<E> queue;
    public MyStack(){
        queue=new LinkedList<>();
    }
    void push(E element){

        queue.offer(element);
    }
    int pop() throws NoSuchElementException {

       if (queue.isEmpty())
           throw new NoSuchElementException("The stack is empty");
       E poppedElement=queue.remove();

        return (int) poppedElement;
    }
}
