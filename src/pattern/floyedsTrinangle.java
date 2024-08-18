package pattern;

public class floyedsTrinangle {
    public static void main(String[] args) {
        int a =1;
        for(int i =1; i<=4;i++){//rows

            for(int j =1 ;j<=i;j++){
                System.out.print(a++ +" ");//col here we can use a++ which is a post increase operator.
                //a+=1;
            }

            System.out.println();
        }
    }





}
