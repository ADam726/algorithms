package com.codkeka.algorithms;
//문자열 곱하기
import java.util.Scanner;

public class MultiplyString {

    public static String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for( int i = 0; i < k; i++){
            answer.append(my_string);
        }
        return answer.toString();
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String my_string = scanner.next();
        int k = scanner.nextInt();
        String answer = solution(my_string, k);
        System.out.println(answer);

    }
}
