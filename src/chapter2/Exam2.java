package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println(Arrays.toString(a));
        System.out.println("a[" + idx1 + "]과 a[" + idx2 + "]을 교환합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소수 :");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        reverse(x);
    }
}
