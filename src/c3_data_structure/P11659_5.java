package c3_data_structure;

import java.util.Scanner;

public class P11659_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] sums = new int[n+1];
        sums[0] = 0;

        for(int i = 1; i<=n; i++){
            int num = sc.nextInt();
            sums[i] = sums[i-1] + num;
        }

        for(int k = 1; k<=m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int result = sums[j] - sums[i-1];
            System.out.println(result);
        }
    }
}