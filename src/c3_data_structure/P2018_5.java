package c3_data_structure;

import java.util.Scanner;

public class P2018_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = 1;
        int end = 1;
        // n 값은 늘 포함하므로 1로 설정
        int sum = 1;

        int count = 1;

        while (end < n) {
            if (sum < n) {
                end += 1;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start += 1;
            } else if (sum == n) {
                count += 1;
                end += 1;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
