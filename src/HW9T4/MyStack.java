package HW9T4;
import java.util.Arrays;
public class MyStack <T>{
        private T[] array;
        private int top;
        private int capacity;
        public MyStack(int size) {
            array = (T[]) new Object[size];
            top = -1;
            capacity = size;
        }

        public int size() {
            return top + 1;
        }

        public boolean isFull() {
            return size() == capacity;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(T item) {
            if (isFull()) {
                System.out.println("Overflow\nProgram Terminated\n");
                System.exit(-1);
            }
            System.out.println("Inserting " + item);
            array[++top] = item;
        }

        public T pop() {
            if (isEmpty()) {
                System.out.println("Underflow\nProgram Terminated");
                System.exit(-1);
            }
            System.out.println("Removing " + peek());

            return array[top--];
        }

        public T peek() {
            if (!isEmpty()) {
                return array[top];
            } else {
                System.exit(-1);
            }
            return array[top];
        }

        public T remove(int index) {
            T removedElement = (T) array[index];
            Object[] newArray = new Object[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = (T[]) newArray;
            --top;
            return removedElement;
        }

        public void clear() {
            top = -1;
            array = (T[]) new Object[capacity];
            System.out.println("clear stack");
        }

        public int sizearray() {
            return top + 1;
        }

        @Override
        public String toString() {
            String ans = "";
            for (int i = 0; i <= top; i++)
                ans += array[i] + "  ";
            return ans;
        }
    }
