import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) stack.pop();
            else stack.push(num);
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

}