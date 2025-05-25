package c3_data_structure;

import java.util.Scanner;

public class P11720_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nStr = sc.next();
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += nStr.charAt(i) -'0';
            //sum += Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }

        System.out.println(sum);
    }
}
