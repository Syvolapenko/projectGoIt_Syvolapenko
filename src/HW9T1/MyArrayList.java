package HW9T1;
import java.util.Arrays;
import java.util.Objects;
    public class MyArrayList<T> {
        private T[] list;
        private int size;
        private int  DEFAULT_CAPACITY = 10;


        public MyArrayList() {
            list = (T[]) new Object[DEFAULT_CAPACITY];
        }

        public MyArrayList(int capacity) {
            list = (T[]) new Object[capacity];
        }

        @Override
        public String toString() {
            return "MyArrayList{" +
                    "list=" + Arrays.toString(list) +
                    '}';
        }

        public void add(T element) {
            resizeIdNeeded();
            list[size] = element;
            size++;
        }

        public T remove(int index) {
            Objects.checkIndex(index, size);
            T removedElement = (T) list[index];
            Object[] newArray = new Object[list.length - 1];
            System.arraycopy(list, 0, newArray, 0, index);
            System.arraycopy(list, index + 1, newArray, index, list.length - index - 1);
            list = (T[]) newArray;
            return removedElement;
        }

        public void resizeIdNeeded() {
            if (list.length == size) {
                Object[] newArray = new Object[list.length + 1];
                System.arraycopy(list, 0, newArray, 0, size);
                list = (T[]) newArray;
            }
        }


        public T get(int index) {
            Objects.checkIndex(index, size);
            return list[index];
        }

        public int size() {
            int num = 0;
            for (T elementsArray : list) {
                num++;
            }
            return num;
        }

        public void display() {
            for (T elements : list) {
                System.out.println(elements);
            }
        }

        public void clear() {
            size = 0;
            list = (T[]) new Object[DEFAULT_CAPACITY];
        }
    }
