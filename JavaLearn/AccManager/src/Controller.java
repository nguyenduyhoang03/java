import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Controller {
    String username;
    String password;
    Repository repository = new Repository();
    List<User> users = repository.getData();
    Scanner sc = new Scanner(System.in);
    public void home(){
        Menu.mainMenu();
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                login();
                break;
            case 2:
                createAccount();
                break;
            default:
                break;
        }
    }
    public Controller() throws FileNotFoundException {
    }
    public void login(){
        boolean checkLogin = false;
        while (!checkLogin){
            System.out.println("Enter username: ");
            username = sc.nextLine();
            int count = 0;
            for (int i = 0; i < users.size(); i++){
                if (username.equals(users.get(i).getUsername())){
                    count++;
                    System.out.println("Enter your password: ");
                    password = sc.nextLine();
                    if (password.equals(users.get(i).getPassword())){
                        loginSuccess();
                        checkLogin = true;
                    }else {
                        loginFail();
                        break;
                    }
                }
            } if (count ==0 ){
                System.out.println("Re-check Username");
            }
        }
    }
    public void loginSuccess(){
        System.out.println("Welcome: " + username);
    }
    public void loginFail(){
        System.out.println("Login fail");
        Menu.loginFail();
    }
    public void changeUsername(){}
    public void changeEmail(){}
    public void changePassword(){}
    public void forgotPassword(){}
    public void createAccount(){}
}
