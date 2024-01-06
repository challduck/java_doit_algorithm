package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Exam4 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소수 :");
        int num = stdIn.nextInt();
        int[] b = new int[num];
        int[] a = new int[num];

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] :");
            b[i] = stdIn.nextInt();
        }

        copy(a, b);

        System.out.println("b = " + Arrays.toString(b));
        System.out.println("배열 b를 복사한 a = " + Arrays.toString(a));
    }
}
