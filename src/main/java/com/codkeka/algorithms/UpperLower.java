package com.codkeka.algorithms;

import java.util.Scanner;

public class UpperLower {
    //대소문자 바꿔서 출력하기
    //Character.toUpperCase() / LowerCase()의 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if ('a' <= ch && ch <= 'z'){
                ch = Character.toUpperCase(ch);
            }else if ('A' <= ch && ch < 'Z'){
                ch = Character.toLowerCase(ch);
            }
            System.out.print(ch);
        }
    }
}
