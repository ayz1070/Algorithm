package c3_data_structure;

import java.util.Scanner;

public class P2018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int s =1;
        int e =1;
        int sum=1;
        int count=1;

        while(e != n){
            if(n==sum){
                e++;
                sum=sum+e;
                count++;
            }else if(n<sum){
                sum-=s;
                s++;
            }else if(n>sum){
                e++;
                sum+=e;
            }
        }
        System.out.println(count);
    }
}
