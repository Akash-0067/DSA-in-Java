package pattern;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n;i++){//rows

            for(int j =1 ;j<=n;j++){
                if(j==i || i+j==n+1)
                    System.out.print("*");

                else
                    System.out.print(" ");



            }
            System.out.println();
        }
    }


}
