package c3_data_structure;

import java.util.Scanner;

public class P11720_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 총합 결과
        int sum = 0;

        // 입력값의 자리수
        int n = sc.nextInt();
        // 입력 숫자
        String sNum = sc.next();

        // String 값 -> 문자 배열로 변환
        char[] cNums = sNum.toCharArray();

        for (int i = 0; i < n; i++){
            sum += cNums[i] - '0';
            //print("for문 " + i + "회차 결과 : " + sum);
        }

        System.out.println(sum);
    }

    // 디버그용 출력 함수
    static void print(String s) {
        System.out.println(s);
    }
}
