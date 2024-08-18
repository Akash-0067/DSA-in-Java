package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(10);
        arr.add(1,11);
        arr.add(2,12);
        arr.add(3,13);
        arr.add(4,14);
        arr.add(5,15);
       //to print complete ArrayList
        // System.out.println(arr);
        System.out.println(arr.size());
        for(int i = 0;i<=5;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(2,300);//modify
        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");// arr[i]
        }
        arr.add(90);//push back
        System.out.println();
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");//arr[i]
        }

    }

}



