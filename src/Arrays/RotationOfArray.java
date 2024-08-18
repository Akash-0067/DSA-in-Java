package Arrays;

import java.util.Scanner;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] arr = {45, 56, 65, 78, 74, 89, 54};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = k % n;
        int[] brr = new int[n];
        int j = 0;
        for (int i = n - m; i < n; i++) {
            brr[j] = arr[i];
            j++;
        }
        for (int i = 0; i <= n - m - 1; i++){
            brr[j] = arr[i];
            j++;
        }
        for (int ele : brr) {
            System.out.print(ele + " ");

        }
    }
}