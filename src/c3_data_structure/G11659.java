package c3_data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G11659 {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 누적 합 배열 초기화
        int[] prefixSums = new int[n + 1]; // 1-based indexing
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            prefixSums[i] = prefixSums[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 쿼리 처리
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 구간 합 계산
            sb.append(prefixSums[j] - prefixSums[i - 1]).append('\n');
        }

        // 결과 출력
        System.out.print(sb);
    }
}