package chapter1;

import java.util.Scanner;

public class Exam8 {
    static int sumof(int num1, int num2) {
        int min = 0;
        int max = 0;
        int sum = 0;

        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("정수 a부터 b 까지의 합을 구하는 메서드입니다. 두가지 숫자를 입력해 주세요.");
        System.out.println(sumof(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
    }

}
