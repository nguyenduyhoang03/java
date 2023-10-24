package ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void initArrayList(){
        //de tao ArrayList co 2 cach
        //cach 1: thong qua instance
        ArrayList<String> animals = new ArrayList<>();
        //cach 2: thong qua in list interface
        List<String> Student = new ArrayList<>();
        // them phan tu cho arraylist
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Pig");
        animals.add("Cat");
        // chen vao index trong mang
        // neu khong dien index, auto dua xuong cuoi mang
        animals.add(2,"T-rex");
        System.out.println(animals);
        //size
        System.out.println("Size Of ArrayList: " + animals.size());
        //for each
        for (String ary: animals){
            System.out.println(ary);
        }
    // lay 1 ptu trong arraylist
        System.out.println("Truy cap vao ptu xac dinh: " + animals.get(3));
        //cap nhat phan tu
        animals.set(3,"Yasuo");
        System.out.println(animals);
        //xoa phan tu trong arraylist
        animals.remove("cat");
        animals.remove(1);
        System.out.println(animals);
        // xoa het
        animals.clear();
        System.out.println("after clear: " + animals);
    }

    public static void main(String[] args) {
        initArrayList();
    }
}
