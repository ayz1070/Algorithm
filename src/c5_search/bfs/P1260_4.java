package c5_search.bfs;

import java.util.*;

public class P1260_4 {
    static boolean visited[];
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int start = sc.nextInt();

        // 1. 인접리스트 초기화, 방문 배열 초기화, 스택에 첫 노드 삽입 (dfs, bfs 공통)
        arr = new ArrayList[n+1];
        for(int i =1; i<=n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        // 인접리스트 초기화
        for(int i =0; i<e; i++){
            int first = sc.nextInt();
            int last = sc.nextInt();
            arr[first].add(last);
            arr[last].add(first);
        }
        // 방문 배열 초기화
        visited = new boolean[n+1];

        // 번호가 작은 것을 먼저 방문하기 위해 정렬
        for(int i = 1; i<=n; i++){
            Collections.sort(arr[i]);
        }
        // dfs 수행
        dfs(start);

        System.out.println();

        // bfs
        // 방문 배열 초기화 (bfs 사용을 위한)
        visited = new boolean[n+1];

        bfs(start);
    }

    public static void dfs(int node){
        // 2. 스택에서 꺼낸 노드의 인접 노드를 스택에 삽입
        System.out.print(node + " ");
        visited[node] = true;
        for(int i : arr[node]){
            // 3. 스택이 빌 때 까지 반복
            if(!visited[i]) dfs(i);
        }
    }

    public static void bfs(int node){
        // 큐 초기화 및 첫 노드 삽입
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        // 2. 큐에서 꺼낸 노드의 인접 노드를 다시 큐에 삽입
        // 3. 큐가 빌 때까지 반복하기
        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now);
            for(int i : arr[now]){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }
}



