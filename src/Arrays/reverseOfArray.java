package Arrays;



public class reverseOfArray {
    public static void main(String[] args) {
        int[] arr ={45,56,65,78,74,89,54};
        int n = arr.length;
        for(int ele :arr){
            System.out.print(ele+" ");

        }
        System.out.println();
        //reverse of arrays
//        for(int i =0;i<n/2;i++){
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] =arr[j];
//            arr[j] = temp;
//        }
        // methode 2
        //int i =1;j=6;(for part of array reverse)
        int i =0, j = n-1;
        while(i<=j){

            swap(arr ,i ,j);
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] =temp;

    }
}
