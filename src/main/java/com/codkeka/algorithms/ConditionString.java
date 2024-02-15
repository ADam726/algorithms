package com.codkeka.algorithms;
//조건 문자열
import java.util.Scanner;
public class ConditionString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ineq = scanner.next();
        String eq = scanner.next();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int answer = solution(ineq, eq, n, m);

        System.out.println(answer);
    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        /* 4가지 경우의 수 발생
        1. > =  2. > !  3. < = 4. < !
        if문으로 각각의 조건 해결 */

        if( ineq.equals(">") && eq.equals("=") ){
            answer = (n >= m) ? 1 : 0;
        }else if( ineq.equals(">") && eq.equals("!") ){
            answer = (n > m) ? 1 : 0;
        }else if( ineq.equals("<") && eq.equals("=") ){
            answer = (n <= m) ? 1 : 0;
        }else if( ineq.equals("<") && eq.equals("!") ){
            answer = (n < m) ? 1 : 0;
        }
        return answer;
    }
}
