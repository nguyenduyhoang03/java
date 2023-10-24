package Banking;

import java.io.IOException;

public class ATMapplication {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        System.out.println("Wellcome to the ATM application");
        menu.mainMenu();
    }
}
