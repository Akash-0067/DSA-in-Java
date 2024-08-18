package Arrays;

import java.util.Arrays;

public class builtInMethod {
    public static void main(String[] args) {
        int[] arr = {30,47,56,45,57,89,75};
        //for each loop
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
