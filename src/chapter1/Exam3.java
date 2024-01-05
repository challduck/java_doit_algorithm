package chapter1;

public class Exam3 {
    static int min4(int a, int b, int c, int d) {

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        // 4 숫자의 최솟값
        System.out.println(min4(5, 7, 4, 9));
    }

}
