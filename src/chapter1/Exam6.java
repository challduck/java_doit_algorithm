package chapter1;

import java.util.Scanner;

public class Exam6 {
    static int SumWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("i 값 :" + i);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Exam6. 1부터의 입력받은 수의 합 메서드입니다. 숫자를 입력해주세요.");
        System.out.println(SumWhile(new Scanner(System.in).nextInt()));
    }

}
