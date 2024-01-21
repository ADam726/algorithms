package com.codkeka.algorithms;

import java.util.Scanner;
//홀짝 구분하기
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " is " + ((n%2==0)?"even":"odd"));
    }
}
