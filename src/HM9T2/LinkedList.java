package HM9T2;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public void addFirst(T t){
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
        size++;
    }
    public void addLast(T t){
        if(head == null){
        head = new Node<>(t);
        }
        Node<T> currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
currentNode.next = new Node<>(t);
        size++;
    }

    public void remove(T t){
        if(head == null){
        return;
        }
        if(t == head.value){
            head = head.next;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null){
            if(currentNode.next.value == t){
                currentNode.next = currentNode.next.next;
                size--;
                return;
            }
            currentNode = currentNode.next;

        }

    }
    public void clear(){
        head = null;
        size = 0;
    }

    public Node<T> get(int index){
        Node <T> current = head;
        for(int i=0; i< index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size(){
    return size;
        }


    @Override
    public String toString() {
        return "LinkedList " +
                "head = " + head;
    }

    private static class Node<T>{
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
