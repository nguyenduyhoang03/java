import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product tomato = new Product("F523", "Tomato", "Food", 1.5, 59);
        Product zaraShirt = new Product("A763", "Zara Shirt", "Appearance", 12.0, 90);
        Product kitchenTable = new Product("H320", "Kitchen Table", "HouseHold", 299.0, 13);
        Product iPhone = new Product("E092", "Iphone", "Electronic", 1000.0, 4);
        Product football = new Product("S108", "Football", "Sport", 19.9, 2);

        Order MikeTyson = new Order();
        MikeTyson.setCustomerName("Mike Tyson");
        MikeTyson.setTransactionTime("2023-08-08 11:30:00");
        MikeTyson.addProduct(tomato, 5);
        MikeTyson.addProduct(football, 4);
        System.out.println(MikeTyson.toString());

        DeliveryOrder ChrisEvan = new DeliveryOrder();
        ChrisEvan.setTransactionTime("2023-08-09 13:14:00");
        ChrisEvan.setAddress("123 Cau Giay");
        ChrisEvan.addProduct(zaraShirt, 3);
        ChrisEvan.addProduct(iPhone, 3);
        System.out.println(ChrisEvan.toString());
    }
}