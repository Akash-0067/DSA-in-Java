package Arrays;

import java.util.Scanner;

public class rotationOFArray2 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 5, 8, 7, 6, 3};
        int n = arr.length;



        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = k % n;
        int j =0;
        for(int i =n-m;i<n/2;i++){

            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            j++;

        }
        for(int i=0;i<(n-m);i++){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] =temp;


        }
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();    }
}