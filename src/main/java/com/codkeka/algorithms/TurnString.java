package com.codkeka.algorithms;
//문자열 돌리기
//.charAt() 함수 사용
import java.util.Scanner;

public class TurnString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            System.out.println(ch);
        }
    }
}
