package c3_data_structure;

import java.util.Scanner;

public class P11720_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numString = sc.next();

        char[] numChars= numString.toCharArray();

        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += (numChars[i]-'0');
        }
        System.out.println(sum);
    }
}
