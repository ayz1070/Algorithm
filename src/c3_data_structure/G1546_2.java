package c3_data_structure;

import java.util.Scanner;

public class G1546_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            double maxScore = 0.0;
            double sum = 0.0;

            // 한 번의 반복으로 최대값, 합계 동시 계산
            for(int i = 0; i < n; i++) {
                double score = sc.nextDouble();
                if(score > maxScore) {
                    maxScore = score;
                }
                sum += score;
            }

            double result = sum * 100 / (maxScore * n);
            System.out.println(result);
        }
    }
}