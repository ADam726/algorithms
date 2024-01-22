package com.codkeka.algorithms;
//문자열 겹쳐쓰기2
//substring 함수 사용해서 해결
import java.util.Scanner;
public class OverwriteString2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String my_string = scanner.next();
        String overwrite_string = scanner.next();
        int s = scanner.nextInt();
        String answer = solution(my_string, overwrite_string, s);
        System.out.println(answer);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
       /* StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s; i++){
            answer.append(my_string.charAt(i));
        }
        answer.append(overwrite_string);
        for(int i = overwrite_string.length() + s; i < my_string.length(); i++){
            answer.append(my_string.charAt(i));

        }

        return answer.toString();*/

        String answer;
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        answer = before + overwrite_string + after;
        return answer;
    }
}
