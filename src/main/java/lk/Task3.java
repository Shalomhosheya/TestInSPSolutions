package lk;

public class Task3 {
    public static void main(String[] args) {

        int num[] = new int[101];

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i < 101; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        for (int i = 1; i < 12; i++) {
            System.out.println(num[i]);
        }
    }
}
