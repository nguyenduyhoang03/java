public class Menu {
    public static void mainMenu(){
        System.out.println("Your select:");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("Your choice:");
    }
    public static void loginFail(){
        System.out.println("Wrong password");
        System.out.println("1.Re-Login");
        System.out.println("2. Forgot Password");
        System.out.println("Your choice: ");
    }
    public static void loginSuccess(){
        System.out.println("1.Change Username");
        System.out.println("2.Change Email");
        System.out.println("3.Change Password");
        System.out.println("4.Logout");
        System.out.println("5.Exit");
    }
}
