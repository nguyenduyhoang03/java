package Array;

import java.util.Base64;
import java.util.Scanner;

public class ArrayExample {
    public static void initArray(){
        int size = 10;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void arraySort(int ary[]){
        int i,j;
        for (i = 0; i < ary.length; i++ ){
            for (j = i + 1; j < ary.length; j++){
                if (ary[i] < ary[j]){
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
    }
    public static String base64CodeDecode(String input){
        return Base64.getEncoder().encodeToString(input.getBytes());
    }
    public static String base64Decode(String input){
        return new String(Base64.getDecoder().decode(input.getBytes()));
    }
    public static void main(String[] args) {
//        int newAry[] = {1,43,5,7,9};
//        arraySort(newAry);
//        System.out.println(newAry);
        String str = "Nguyen Duy Hoang";
        base64CodeDecode(str);
        System.out.println(str);
    }
}
