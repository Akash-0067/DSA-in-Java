package Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,23,45,97,56,78,90};
        int sum = 1;
        for( int i=0;i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
