import java.util.Scanner;
public class terneryoperator {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("ENTER THE NUMBER : ");
       int n = sc.nextInt();
       // expression 1 ? expression 2 : expression 3
        System.out.println((n%2==0)?"EVEN": "ODD");

    }
}
