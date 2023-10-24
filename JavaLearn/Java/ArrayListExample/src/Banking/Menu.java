package Banking;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    // format input data
    Scanner mInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###,##0.00");
    HashMap<Integer, AccountBank> data = new HashMap<>();
    public void getLogin() throws IOException{
        int cusNumber = 0;
        int pinNumber = 0;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Enter customer number: ");
                cusNumber = mInput.nextInt();
                System.out.println("Enter PIN: ");
                pinNumber = mInput.nextInt();
                Iterator it = data.entrySet().iterator();
                while (it.hasNext()){
                    Map.Entry pair = (Map.Entry) it.next();
                    AccountBank acc = (AccountBank) pair.getValue();
                    if ( cusNumber == acc.getCustomerNumber() && cusNumber == acc.getPinNumber()) {
                        getAccounType(acc);
                        flag = true;
                        break;
                    }
                }
                System.out.println("Wrong customer number or PIN");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void creatAccount() throws IOException{
        boolean flag = false;
        int cNumber = 0;
        while (!flag){
            try {
                System.out.println(" Enter customer details:");
                cNumber = mInput.nextInt();
                Iterator it = data.entrySet().iterator();
                while (it.hasNext()){
                    Map.Entry pair = (Map.Entry)it.next();
                    flag = true;
                }
                if (!flag){
                    System.out.println(" this customer is already");
                }
            }
            catch (Exception ex){
                System.out.println(" Invalid choice");
                mInput.nextInt();
            }
            System.out.println(" Enter PIN");
            int pin = mInput.nextInt();
            data.put(cNumber,new AccountBank(cNumber,pin));
            System.out.println(" Your new account has been successfully");
            System.out.println(" Redirect to login");
            getLogin();
        }
    }
    public void getAccounType(AccountBank acc){
        // types of account: saving, savingInput, savingWithdraw
        boolean flag = false;
        while (!flag){
            try {
                System.out.println("Choice your account type: ");
                System.out.println("1. Checking Account: ");
                System.out.println("2. Saving Account: ");
                System.out.println("3. Exit ");
                int choice = mInput.nextInt();
                mInput.nextLine();
                switch (choice) {
                    case 1:
                        getChecking(acc);
                        break;
                    case 2:
                        getSaving(acc);
                        break;
                    case 3:
                        flag = true;
                        break;
                    default:
                        System.out.println("\n Invalid choice");
                }

            } catch (Exception ex) {
                System.out.println("\n Error!!!");
            }
        }
    }
    public void getSaving(AccountBank acc){}
    public void getChecking(AccountBank acc){
        //get checking account after login success
        boolean flag = false;
        while (!flag){
            System.out.println("Checking account ");
            System.out.println("1.view balance");
            System.out.println("2.withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Transfer");
            System.out.println("5.Exit");
            int choice = mInput.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Checking account balance: " + moneyFormat.format(acc.getCheckingBalance()));
                    break;
                case 2:
                    acc.getCheckingWithdrawInput();
                    break;
                case 3:
                    acc.getCheckingDepositInput();
                    break;
                case 4:
                    acc.getTransferInput();
                    break;
                case 5:
                    flag = true;
                    break;
                default:
                    System.out.println("\n Invalid choice");
                    mInput.next();
            }
        }
    }
    public void mainMenu() throws  IOException{
        data.put(1, new AccountBank(11111,22222,1000,3000));
        data.put(2, new AccountBank(33333,33333,1000,3000));
        data.put(3,new AccountBank(5555,5555,1000,1000));
        data.put(3,new AccountBank(6666,6666,1000,1000));
        boolean flag = false;
        while (!flag){
            try{
                System.out.println(" 1.Login: ");
                System.out.println(" 2.Create account");
                System.out.println(" 3.Enter your choice");
                int choice = mInput.nextInt();
                switch (choice){
                    case 1:
                        getLogin();
                        flag = true;
                        break;
                    case 2:
                        creatAccount();
                        flag = true;
                        break;
                    default:
                        System.out.println("\n Invalid choice !");
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

}
