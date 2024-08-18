package Arrays;

import java.util.ArrayList;

public class ArrayListsAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(90);
        System.out.println(list+" "+list.size());
        list.add(80);
        System.out.println(list+" "+list.size());
        list.add(70);
        System.out.println(list+" "+list.size());
        list.add(50);
        System.out.println(list+" "+list.size());
        list.remove(0);
        System.out.println(list+" "+list.size());

    }
}
