## 알고리즘 
- dfs
## 접근
- dfs 수행한 횟수를 구하면 답

## 슈도 코드

m (노드), n(에지) 개의 노드를 입력
graph 초기화 (인접 리스트)
visited 배열 초기화

for(n의 개수만큼){
    graph의 각 ArrayList 초기화
}

for(m만큼){
    graph 데이터 삽입
}

for(n만큼){
    if(방문하지 않았다면){
        count ++;
        dfs 수행;
    }
}

dfs(int now){
    if(현재 노드 == 방문 노드) return;
    visited 배열에 현재 노드 방문 기록
    현재 노드의 연결 노드 중 방문하지 않은 노드로 dfs 실행 (재귀적으로)
}


