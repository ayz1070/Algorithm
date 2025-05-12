package c3_data_structure;

import java.util.Scanner;

public class P11659_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] sums = new int[n];

        for(int i =0; i<n; i++){
            int num = sc.nextInt();
            if(i==0){
                sums[i] = num;
            }else{
                sums[i] = sums[i-1] + num;
            }

        }


        for(int k =1; k<=m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            if(i==1){
                System.out.println(sums[j-1]);
            }else{
                System.out.println(sums[j-1]-sums[i-2]);
            }
        }
    }
}