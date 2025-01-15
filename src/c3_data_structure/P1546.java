package c3_data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        List<Double> m = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            m.add(sc.nextDouble());
        }

        double max = Collections.max(m);
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += m.get(i);
        }
        System.out.println(sum*100/(max*n));
    }
}
