package lk;

public class Task4 {
    public static void main(String[] args) {
        int[] ar = {50, 2, 1, 9};
        sorting(ar);
    }

    private static void sorting(int[] ar) {
        int temp;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {

                if (ar[j] < ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
