package c5_search.dfs;


import java.util.ArrayList;
import java.util.Scanner;

public class P11724 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<n+1; i++){
            graph[i] = new ArrayList();
        }

        for(int i =1; i<m+1; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s].add(e);
            graph[e].add(s);
        }
        int count =0;
        for(int i = 1; i<n+1; i++){
            if(!visited[i]){
                count++;
                dfs(i);

            }
        }
        System.out.println(count);
    }

    static void dfs(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : graph[v]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
