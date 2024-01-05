package chapter1;

import java.util.Scanner;

import check.ProcessRuntimeCheck;

public class Exam10 {
    public static void main(String[] args) {
        ProcessRuntimeCheck prc1 = new ProcessRuntimeCheck();
        ProcessRuntimeCheck prc2 = new ProcessRuntimeCheck();

        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수값의 자리수를 구합니다.");

        int n;

        do {
            System.out.print("정숫값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        int no = 0; // 자릿수

        prc1.start();
        while (n > 0) {
            n /= 10; // n을 10으로 나눕니다
            no++;
        }
        System.out.println("그 수는 " + no + "자리 입니다.");
        prc1.end();
        System.out.println(prc1.calc());

        String a = Integer.toString(new Scanner(System.in).nextInt());
        prc2.start();
        System.out.println("그 수는 " + a.length() + "자리 입니다.");
        prc2.end();
        System.out.println(prc2.calc());
    }
}