package c5_search.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

// dfs
// 1. 인접 리스트 그래프 초기화
// 2. 방문 리스트 초기화
// 3. 시작 노드 스택 삽입
// 4. dfs 재귀 호출

public class P11724_2 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1; i< n+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);

        }
        int count = 0;
        for(int i = 1; i<n+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v){
        if(visited[v]) return;
        visited[v] = true;
        for(int w : graph[v]){
            if(visited[w]==false){
                DFS(w);
            }
        }
    }
}
