package c3_data_structure;

import java.util.Scanner;

public class G2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;  // 자기 자신을 표현하는 경우 포함
        int sum = 1;
        int start = 1;
        int end = 1;

        while (end < n) {
            if (sum < n) {
                sum += ++end;
            } else if (sum > n) {
                sum -= start++;
            } else {
                count++;
                sum += ++end;
            }
        }

        System.out.println(count);
    }
}