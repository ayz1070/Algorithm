package c3_data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1546_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        // 입력값 개수
        int n = sc.nextInt();

        List<Integer> scores = new ArrayList<>();
        for(int i = 0 ; i< n; i++){
            int input = sc.nextInt();
            sum  += input;
            scores.add(input);
        }

        // 점수 중 최대값
        int m = Collections.max(scores);

        double result = (sum * 100) / (m*n);

        System.out.println(result);

        sc.close();

    }
}