package DoItYourself;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle[] triangle = new Triangle[5];

        for (int i = 0; i < 5; i++) {
            try {
                double a, b, c;
                System.out.println("Please enter the length of the sides of the triangle: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                triangle[i] = new Triangle(a,b,c);
            } catch (InvalidTriangleException e) {
                System.out.println(e);
            }
        }
        System.out.println("The area of the 5th triangle is: " + triangle[4].getArea());
    }
}
