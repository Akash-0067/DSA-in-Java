package Arrays;

public class basicSyntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // initialising individual elements
        arr[0] = 100;
        arr[1] =20;
        arr[2] =40;
        arr[3] =50;
        arr[4] = 35;

    // OUTPUT OF ARRAY ELEMENTS

        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");


        //UPDATE
        arr[0] =99;
        arr[0] += 10;
        System.out.println(arr[0] + " ");
    }
}
