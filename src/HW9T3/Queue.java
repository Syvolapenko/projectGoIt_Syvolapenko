package HW9T3;

import java.util.Arrays;

public class Queue {
    private int [] array;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        array = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
        count = 0;
    }
public void display(){

        for(int i =0; i<size(); i++){
            System.out.println(array[i]);
        }
}
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == capacity);
    }

    public void add(int item) {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) ;
        array[rear] = item;
        count++;
    }
    public void clear(){
        array = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }
    public int peek(){
        return array[front];
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        int x = array[front];

        System.out.println("Removing " + x);
        for (int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[4]=0;
        System.out.println(Arrays.toString(array));

        count--;
        rear --;
        return x;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "array=" + Arrays.toString(array) +
                ", front=" + front +
                ", rear=" + rear +
                ", capacity=" + capacity +
                ", count=" + count +
                '}';
    }
}
