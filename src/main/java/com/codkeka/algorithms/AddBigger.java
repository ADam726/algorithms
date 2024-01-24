package com.codkeka.algorithms;

import java.util.Scanner;
//더 크게 합치기
public class AddBigger {

    public static int solution(int a, int b) {
        int answer = 0;
        String aValue = String.valueOf(a);
        String bValue = String.valueOf(b);

        String abValue = aValue + bValue;
        String baValue = bValue + aValue;

        answer = Integer.parseInt(abValue) >= Integer.parseInt(baValue) ? Integer.parseInt(abValue) : Integer.parseInt(baValue) ;

        return answer;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = solution(a, b);
        System.out.println(answer);

    }
}
