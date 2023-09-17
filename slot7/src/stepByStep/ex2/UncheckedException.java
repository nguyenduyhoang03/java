package stepByStep.ex2;

import java.util.Scanner;

public class UncheckedException {
    public UncheckedException() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int a[] = new int[n];
        try {
            for (int i = 0; i <= n; i++) {
                System.out.println("a[" + i + "] = ");
                a[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArithmeticException("Enter too much array length");
        }

    }

}

