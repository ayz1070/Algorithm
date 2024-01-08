package C3_DataStructure;

import java.util.Scanner;

public class P11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[n+1];
        s[0] = 0;
        for(int i =1; i<n+1; i++){
            s[i] = s[i-1] + sc.nextInt();
        }

        for(int k =0; k<m; k++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(s[end]-s[start-1]);
        }
    }
}
