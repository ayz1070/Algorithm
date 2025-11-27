package c5_search.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class P13023_3 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i =0; i<n; i++){
            graph[i] = new ArrayList();
        }

        for(int i =0; i<m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s].add(e);
            graph[e].add(s);
        }

        for(int i =0; i<n; i++){
            count = 1;
            dfs(i);
        }
    }

    static void dfs(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : graph[v]){
            if(!visited[i]){
                count++;
                if(count>=5){
                    System.out.println("1");
                    return;
                }
                dfs(i);
            }
        }
    }

}
