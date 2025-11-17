package c3_data_structure;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C11659 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int[] sums = new int[n+1];
        sums[0]=0;

        for(int a = 1;a<=n;a++){
            int num = sc.nextInt();
            sums[a] = sums[a-1] + num;
        }

    }
}
