package c3_data_structure;

import java.io.*;
import java.util.StringTokenizer;

public class C11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] sums = new int[n+1];
        sums[0] = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sums[i] = sums[i-1] + num;
        }

        StringBuilder sb = new StringBuilder();
        for(int a = 0; a<m; a++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            sb.append(sums[j] -sums[i-1]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
