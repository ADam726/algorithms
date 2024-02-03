package com.codkeka.algorithms;

import java.util.Scanner;
//n의 배수
public class Multiple {
    public static int solution(int num, int n) {
        int answer = 0;
        return answer = (num % n == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int answer = solution(a,b);

        System.out.println(answer);
    }
}
