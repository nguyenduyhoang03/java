package jsonApplication;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        //write
        //create write
        //bufferedWrite tang toc do doc
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("Customer.json"));

        //create collection
        Map<String, Object> customer = new HashMap<>();
        customer.put("id",2);
        customer.put("name","HaHa");
        customer.put("age",20);
        //address
        Map<String,Object> address = new HashMap<>();
        address.put("Street","Ngo Quyen");
        address.put("City","HCM City");
        address.put("code",3000);
        //add address to customer object
        customer.put("address",address);
        //Payment method
        customer.put("PaymentMethod", Arrays.asList("Paypal","MoMo","ZaloPay"));
        //add projects
        Map<String,Object> project1 = new HashMap<>();
        project1.put("title","project 1");
        project1.put("budget",5000);
        //add project to customer
        customer.put("Project",Arrays.asList(project1));
        //create Gson
    }
}
