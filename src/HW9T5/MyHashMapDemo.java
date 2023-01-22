package HW9T5;

public class MyHashMapDemo {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
        myHashMap.put("ALex", 1);
        myHashMap.put("Olena", 6);
        myHashMap.put("Max", 3);
        myHashMap.put("Vitia", 9);
        myHashMap.put("Viktoria",  5);
        System.out.println("myHashMap.sizea() = " + myHashMap.sizeHashMap());
        myHashMap.remove("Max");
        System.out.println(myHashMap);
        System.out.println("myHashMap.sizea() = " + myHashMap.sizeHashMap());
        myHashMap.clear();
        System.out.println(myHashMap);
        myHashMap.put("Slava", 23);
        System.out.println(myHashMap);


    }

}
