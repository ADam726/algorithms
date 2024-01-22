package com.codkeka.algorithms;

import java.util.Scanner;
//문자열 겹쳐쓰기
//substring 사용해서 해결가능
public class OverwriteString1 {

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
            //answer += my_string.charAt(i);
        }
        answer.append(overwrite_string);
        for( int i = s + overwrite_string.length(); i < my_string.length(); i++){
            answer.append(my_string.charAt(i));
            //answer += my_string.charAt(i);
        }
        return answer.toString();
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String my_string = scanner.next();
        String overwrite_string = scanner.next();
        int s = scanner.nextInt();
        String answer = solution(my_string, overwrite_string, s);
        System.out.println(answer);

    }

}
