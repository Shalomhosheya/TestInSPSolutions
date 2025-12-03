package lk;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        String combine = combineList(list,list2);




    }

    private static String combineList(ArrayList<String> list, ArrayList<Integer> list2) {
        String combined = "";
        for (int i = 0; i < list.size(); i++) {
             combined = list.get(i) + list2.get(i);
            System.out.println(combined);
        }
        return combined;
    }
}
