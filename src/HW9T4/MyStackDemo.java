package HW9T4;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.remove(0);
        stack.push(32);
        stack.clear();
        stack.push(32);
        stack.push(121);
        System.out.println("stack.sizearray() = " + stack.sizearray());
        System.out.println(stack);

    }
}
