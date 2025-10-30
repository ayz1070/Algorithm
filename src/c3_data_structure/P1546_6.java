package c3_data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1546_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int[] scores = new int[n];
        int sum = 0;
        int max = 0;

        for(int i =0; i<n; i++){
            int num = sc.nextInt();
            scores[i] = num;
            if(num > max){
                max = num;
            }
        }

        for(int k =0; k<n; k++){
            sum += scores[k];
        }
        System.out.println(sum*100.0/max/n);
    }
}