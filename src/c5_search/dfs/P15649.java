package c5_search.dfs;

import java.util.Scanner;

public class P15649 {
    static int n,m;
    static boolean[] v;
    static int[] s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        s = new int[n+1];
        v = new boolean[n+1];

        backtracking(0);

    }

    private static void backtracking(int length){
        if(length == m){ // 정답인지 확인해서 return;
            // 수열 출력
            printArray();
            return;
        }
        for(int i =1; i<=n; i++){
            if(!v[i]){
                v[i] = true;
                s[length] = i;
                System.out.println("length=" + length + ", i=" + i + " 선택 후 재귀 호출");
                backtracking(length + 1);

                System.out.println("length=" + length + ", i=" + i + " 에서 재귀 종료 후 v[i] = false 실행 시점");
                v[i] = false;
            }
        }
    }

    private static void printArray() {
        for(int i = 0; i<m; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();

    }

}
