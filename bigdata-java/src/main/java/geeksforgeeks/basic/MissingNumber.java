package geeksforgeeks.basic;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int[] arr = new int[scan.nextInt() - 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scan.nextInt();
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] + 1 != arr[j + 1]) {
                    System.out.println(arr[j] + 1);
                    break;
                }
            }
        }
        scan.close();
    }
}
