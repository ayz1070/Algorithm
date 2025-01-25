package c3_data_structure;

import java.util.Scanner;

public class P2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s =1;
        int e =2;
        int sum = 1;
        int count = 1;

        while(e!=n){
            if(n==sum){
                count+=1;
                s+=1;
                sum += e;
            }else if(n<sum){
                e += 1;
            }else if(n>sum){
                s += 1;
            }
        }
        System.out.println(count);
    }
}
