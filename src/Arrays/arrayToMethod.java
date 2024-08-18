package Arrays;

public class arrayToMethod {
    public static void main(String[] args) {
        //int x =5;
        //System.out.println(x);
     int[] arr ={10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

       // change(x);
      //  System.out.println(x);

    }

    public static void change(int[] x) {
        x[0] = 90;

    }
    //public static void change(int x) {
     //  x =10;
   // }

}
