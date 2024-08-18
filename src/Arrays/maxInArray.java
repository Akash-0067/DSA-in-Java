package Arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr ={ 10, 20,34,45,56,643,7655,8667,977};
        int n = arr.length;
        int mx = arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>mx) mx = arr[i];
        }
        System.out.println(mx);
    }
}
