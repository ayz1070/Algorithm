package c3_data_structure;

import java.util.Scanner;

public class P2018_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n+1];
        s[0] = 0;
        for(int i =1; i<n+1; i++){
            s[i] = s[i-1] + i;
        }

        int count = 1;
        int start = 1;
        int end = 1;
        while(end<=n){
            if(s[end]-s[start]<n){
                end++;
            }else if(s[end]-s[start]>n){
                start++;
            }else if(s[end]-s[start]==n){
                count++;
                start++;
            }
        }
        System.out.println(count);
    }
}
