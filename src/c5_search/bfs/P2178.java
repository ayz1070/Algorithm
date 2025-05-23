package c5_search.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0}; // 하 우 상 좌
    static boolean[][] visited;
    static int[][] A;
    static int N,M;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];

        visited = new boolean[N][M];
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j =0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    private static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            visited[i][j] = true;
            for(int k =0; k<4; k++){ // 상하좌우로 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<N && y<M){ // 배열을 넘어가면
                    if(A[x][y]!=0 && !visited[x][y]){   // 0이여서 갈 수 없거나 방문하지 않았던 곳이라면
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] +1; // 핵심
                        queue.add(new int[]{x,y,});

                    }
                }
            }
        }
    }
}
