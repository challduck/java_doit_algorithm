package chapter1;

import java.util.Scanner;

public class Exam7 {
    static int sumFor(int num) {
        int sum = 0;
        if (num % 2 == 1) {
            sum = (1 + num) * (num / 2) + (num - (num / 2));
        } else {
            sum = (1 + num) * (num / 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Exam7. 1부터의 입력받은 수의 합 메서드입니다.(가우스의 덧셈) 숫자를 입력해주세요. ");
        System.out.println(sumFor(new Scanner(System.in).nextInt()));
    }

}
