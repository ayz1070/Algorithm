package c3_data_structure;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class G1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("NO");
            return;
        }

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int nextPushNumber = 1;

        for (int target : sequence) {
            if (target >= nextPushNumber) {
                while (target >= nextPushNumber) {
                    stack.push(nextPushNumber++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (stack.pop() > target) {
                    System.out.println("NO");
                    return;
                }
                sb.append("-\n");
            }
        }
        System.out.println(sb.toString());
    }
}