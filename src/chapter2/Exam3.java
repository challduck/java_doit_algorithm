package chapter2;

import java.util.Scanner;

public class Exam3 {

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소수 :");
        int num = stdIn.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "] :");
            arr[i] = stdIn.nextInt();
        }

        System.out.println("배열의 모든 요소의 합은 " + sumOf(arr) + "입니다.");
    }
}
