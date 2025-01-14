package c3_data_structure;

import java.util.Scanner;

public class G11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); // 숫자 개수 소비
        System.out.println(sc.next().chars().map(ch -> ch - '0').sum());
    }
}