package chapter1;

public class Exam2 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        // 3 숫자의 최솟값
        System.out.println(min3(5, 7, 4));
    }
}
