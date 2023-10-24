package jsonApplication;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class jsonApplicationRearde {
     public static void main(String[] args) throws IOException {
            Reader reader = Files.newBufferedReader(Paths.get("Customer.json"));
            //Identity json object or array structure

            JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();
            //read details aka parser from json file
        System.out.println(parser.get("id").getAsLong());
        System.out.println(parser.get("name").getAsString());
        System.out.println(parser.get("age").getAsLong());
        //read address
        JsonObject address = parser.get("address").getAsJsonObject();
        System.out.println(parser.get("street").getAsString());
        System.out.println(parser.get("city").getAsString());
        System.out.println(parser.get("code").getAsLong());
        //read Paypal method
    }
}
