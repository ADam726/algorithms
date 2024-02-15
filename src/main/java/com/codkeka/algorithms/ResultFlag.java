package com.codkeka.algorithms;
//flag에 따라 다른 값 반환하기
import java.util.Scanner;

public class ResultFlag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean flag = scanner.nextBoolean();

        int answer = solution(a, b, flag);
        System.out.println(answer);
    }

    public static int solution(int a, int b, boolean flag) {
        int answer = flag ? a + b : a - b;
        return answer;
    }
}
