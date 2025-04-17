package c5_search.dfs;


import java.util.Scanner;

public class P2023_2 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);

    }

    static void dfs(int num,int j){
        if(j==n){
            if(isPrime(num)){
                System.out.println(num);
            }
            return;
        }
        for(int i =1; i<=9; i++){
            if(i%2 == 0){
                continue;
            }
            if(isPrime(num * 10 + i)) {
                dfs(num * 10 + i,j+1);
            }
        }
    }

    static boolean isPrime(int number){
        for(int i =2; i<= number/2; i++){
            if(number%i ==0)
                return false;
        }
        return true;
    }
}
