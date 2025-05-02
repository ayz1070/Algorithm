package c5_search.dfs;

import java.io.BufferedReader;
import java.util.Scanner;

public class P2023_3 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);

    }
    static void dfs(int num, int j){
        if(j == N){
            if(isPrime(num)){
                System.out.println(num);
            }
            return;
        }
        for(int i=1; i<10; i++){
            if(i%2==0){
                continue;
            }
            if(isPrime(num*10+i)){
                dfs(num*10+i,j+1);
            }
        }
    }

    static boolean isPrime(int num){
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; i * i <= num; i += 2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
