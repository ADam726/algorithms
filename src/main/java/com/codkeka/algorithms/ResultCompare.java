package com.codkeka.algorithms;

import java.util.Scanner;

public class ResultCompare {
    public static int solution(int a, int b) {
        int answer = 0;
        String aValue = String.valueOf(a);
        String bValue = String.valueOf(b);

        int abValue = Integer.parseInt(aValue) + Integer.parseInt(bValue);
        int baValue = 2 * a * b;

        answer = abValue >= baValue ? abValue : baValue;

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int answer = solution(a,b);

        System.out.println(answer);

    }
}
