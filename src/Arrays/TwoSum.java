package Arrays;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={4,6,7,5,1,0,2};
        int x = 9;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]==x) {
                    System.out.println(i + " " +j);
                    break;
                }
            }break;
        }
    }
}
