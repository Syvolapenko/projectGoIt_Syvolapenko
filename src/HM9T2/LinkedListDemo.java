package HM9T2;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(5);
        linkedList.addFirst(9);
        linkedList.addFirst(28);
        linkedList.addLast(22);
        linkedList.remove(9);
        System.out.println("linkedList.get(2) = " + linkedList.get(1));
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.clear();
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println(linkedList);
    }
}
