package HW9T3;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(3);
        queue.add(8);
        queue.add(4);
        queue.add(35);
        queue.add(48);

        queue.poll();
        queue.poll();
        queue.poll();
        queue.add(33);
        System.out.println(queue);
    }
}