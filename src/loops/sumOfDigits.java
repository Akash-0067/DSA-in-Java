package loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the no. : ");
        int a = sc.nextInt();


        int sum  = 0;
        while(a!=0) {
            int ld = a % 10;
            sum += ld;
            a /= 10;
        }
        System.out.println("sum of digits ="+ sum);
    }
}
