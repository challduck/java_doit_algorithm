package chapter1;

import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("a의 값");
        int a = sc1.nextInt();
        int b;
        while (true) {
            System.out.println("b의 값");
            b = new Scanner(System.in).nextInt();
            if (a < b)
                break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }
        System.out.println("b - a는 " + (b - a) + " 입니다");

    }
}