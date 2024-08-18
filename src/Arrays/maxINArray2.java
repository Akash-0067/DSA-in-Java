package Arrays;

public class maxINArray2 {
    public static void main(String[] args) {
        int [] arr = {-1,-8,-7,-56,-78,-45,-3,-4};
        int n =arr.length;
        int mx =Integer.MIN_VALUE;
        for(int i= 0;i<n;i++){
            //if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
            }
        System.out.println(mx);
    }
}
