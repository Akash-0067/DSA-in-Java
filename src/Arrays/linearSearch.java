package Arrays;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element :");
        int x = sc.nextInt();
        System.out.print("Enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Solution
        boolean flag = false;//means not found
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                flag = true;//means found
            break;
        }
    }
    if(flag==true)System.out.println("Element found");
    else System.out.print("Element not Found");
}
}