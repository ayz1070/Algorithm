package c3_data_structure;

import java.util.Scanner;

public class C1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int m = 0;

        for(int i = 0; i<n; i++){
            int score = sc.nextInt();
            sum += score;
            m = Math.max(m, score);
        }

        double result = (double) sum * 100 / m / n;
        System.out.println(result);

        sc.close();
    }
}
