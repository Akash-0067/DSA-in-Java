package pattern;

public class oddNumber {

           public static void main(String[] args) {

                for(int i =1; i<=7;i++){//rows
                    int a =1;
                    for(int j =1 ;j<=i;j++){
                        System.out.print(a +" ");//col
                        a+=2;
                    }
            System.out.println();
        }
    }
}
