package com.codkeka.algorithms;

import java.util.Scanner;
//문자 리스트를 문자열로 변환하기
public class ArrayString {

    public static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for(String a  : arr){
            answer.append(a);
        }
        return answer.toString();
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String [] arr = new String[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.next();
        }

        String answer = solution(arr);
        System.out.println(answer);

    }
}
