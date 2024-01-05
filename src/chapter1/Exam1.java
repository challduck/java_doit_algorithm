package chapter1;

import java.util.Scanner;

public class Exam1 {
    static int max4(int a, int b, int c, int d) {

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        // 4 숫자의 최댓값
        System.out.println(max4(1, 5, 7, 4));

    }
}
