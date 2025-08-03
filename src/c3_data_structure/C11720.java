package c3_data_structure;

import java.util.Scanner;

public class C11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String numberString = sc.next();

        int sum = 0;
        for(char digit : numberString.toCharArray()) {
            sum += digit - '0';
        }

        System.out.println(sum);
        sc.close();
    }
}
