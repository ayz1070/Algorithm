package c3_data_structure;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i =0 ;i<n; i++){
            scores[i] = sc.nextInt();
        }

        double sum = 0;
        int max = 0;

        for(int i : scores){
            sum += i;
            max = Math.max(max,i);
        }
        System.out.println(sum*100/max/n);
    }
}
