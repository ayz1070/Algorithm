package c3_data_structure;

import java.util.Scanner;

public class P2018_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long sum = 1;
        long count = 1;

        long start = 1;
        long end = 1;

        while (end != n) {
            if (sum == n) {
                count++;
                end++;
                sum += end;
            } else if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            }

        }
        System.out.println(count);
    }
}
