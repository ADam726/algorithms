package com.codkeka.algorithms;
//홀짝에 따라 다른 값 반환하기
import java.util.Scanner;

public class ResultEvenOdd {
    public static int solution(int n) {
        int answer = 0;
        if(n % 2 == 1){
            for(int i = 1; i <= n; i += 2){
                answer += i;
            }
        }else{
            for (int i = 2; i <= n; i += 2){
                answer += i * i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = solution(n);
        System.out.println(answer);
    }
}
