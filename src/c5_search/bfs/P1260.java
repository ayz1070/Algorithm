package c5_search.bfs;


import java.util.*;

public class P1260 {
    static boolean visited[];
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        visited = new boolean[n+1];
        graph = new ArrayList[n+1];

        for(int i =1; i<n+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i =1; i<m+1; i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            graph[s].add(e);
            graph[e].add(s);
        }
        for(int i =1; i<n+1; i++){
            Collections.sort(graph[i]);
        }
        dfs(start);
        System.out.println();
        visited = new boolean[n+1];
        bfs(start);
    }

    static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        System.out.print(v+" ");
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            for(int i : graph[now]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
