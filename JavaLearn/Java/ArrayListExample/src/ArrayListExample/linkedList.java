package ArrayListExample;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void initLinkedList(){
        // co 2 cach de tao
        //cach 1:
        LinkedList<String> cars = new LinkedList<>();
        // cach 2:
        List<String> students = new LinkedList<>();
        // them cac phan tu
        cars.add("Huyndai");
        cars.add("VinFast");
        cars.add("Ford");
        // them vao cac vi tri xac dinh
        cars.add(1,"Toyota");
        //size
        System.out.println("Size of cars: " + cars.size());
        // lay phan tu xac dinh
        System.out.println("Lay phan tu co index = 1: " + cars.get(1));
        //lay ra phan tu dau tien va cuoi cung
        System.out.println("lay ptu dau tien: " + cars.getFirst());
        System.out.println("lay ptu cuoi cung: " + cars.getLast());
        // update phan tu
        cars.set(1,"BMW");
        System.out.println(cars);
        // tra ve ptu dau tien va cuoi cung
        cars.pollFirst();
        cars.pollLast();
        System.out.println("update ds: " + cars);
        // xoa 1 phan tu xac dinh
        cars.remove(1);
        // xoa phan tu dau, cuoi
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);
        //xoa toan bo
        cars.clear();
        System.out.println(cars);
    }

    public static void main(String[] args) {
        initLinkedList();
    }
}
