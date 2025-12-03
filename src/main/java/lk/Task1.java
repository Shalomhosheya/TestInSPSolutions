package lk;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("For loop sum: ");
        forloop(list);

        System.out.print("While loop sum: ");
        forwhile(list);

        System.out.print("Recursion sum: ");
        System.out.println(recursion(list, 0));
    }

    private static void forloop(ArrayList<Integer> list) {
        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }

        System.out.println(total);
    }

    private static void forwhile(ArrayList<Integer> list) {
        int i = 0;
        int total = 0;

        while (i < list.size()) {
            total += list.get(i);
            i++;
        }

        System.out.println(total);
    }

    private static int recursion(ArrayList<Integer> list, int index) {

        if (index == list.size()) {
            return 0;
        }

        return list.get(index) + recursion(list, index + 1);
    }
}
