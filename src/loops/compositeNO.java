package loops;

import java.util.Scanner;


public class compositeNO {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
       int x = 0;//gives prime
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Composite number");
                x = 1;//gives composite
                break;
            }

        }
        if(n==1) System.out.println("neither prime nor composite");
       else if (x == 0) System.out.println("prime number");


    }

}