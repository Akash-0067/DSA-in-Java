package loops;
import java.util.Scanner;
//display this gp 1,2,4,8,16,32....upto n
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int  a =1;
        for(int i =1;i<= n;i++){
            System.out.println(a);
            a*=2;
        }

    }
}
