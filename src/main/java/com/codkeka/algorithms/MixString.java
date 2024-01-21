package com.codkeka.algorithms;

import java.util.Scanner;
//문자열 섞기
public class MixString {
    public static StringBuilder Solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        //String answer = "";
        if( str1.length() >= str2.length()){
            for(int i = 0; i < str1.length(); i++){
                answer.append(str1.charAt(i));
                //answer += str1.charAt(i));
                answer.append(str2.charAt(i));
            }
        }else {
            for(int i = 0; i < str2.length(); i++){
                answer.append(str1.charAt(i));
                answer.append(str2.charAt(i));

            }
        }
        return answer;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        StringBuilder answer = Solution(str1, str2);
        System.out.println(answer);

    }
}
