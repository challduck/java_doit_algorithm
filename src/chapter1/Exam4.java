package chapter1;

public class Exam4 {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // 3 숫자의 중앙값 (if 조건문 구현)
        System.out.println(med3(5, 7, 4));
    }

}
