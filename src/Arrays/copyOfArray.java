package Arrays;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int [] arr = {30, 10 ,40 , 23,89,343};
        for (int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int [] nums = arr;//shallow copy
        nums[0] = 70;
        System.out.println(arr[0]);
        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] =50;
        System.out.println(arr[0]);

    }
}
