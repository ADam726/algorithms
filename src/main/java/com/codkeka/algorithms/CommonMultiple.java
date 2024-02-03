package com.codkeka.algorithms;

import java.util.Scanner;
//공배수
public class CommonMultiple {
    public static int solution(int number, int n, int m) {
        int answer = 0;
        if( number % n == 0 && number % m == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int answer = solution(number, n, m);
        System.out.println(answer);
    }
}
