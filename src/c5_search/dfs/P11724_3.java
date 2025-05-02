package c5_search.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_3 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<n+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 1; i<m+1; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }

        // ---------------- 위 그래프 초기화 ---------------------
        int count = 0;

        for(int i =1; i<n+1; i++){
            if(!visited[i]){
                count += 1;
                dfs(i);
            }
        }
        System.out.println(count);

    }

    static void dfs(int now){
        if(visited[now]) return;
        visited[now] = true;
        for(int v : graph[now]){
            if(!visited[v]){
                dfs(v);
            }
        }
    }
}
