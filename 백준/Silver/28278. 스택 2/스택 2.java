import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                stack.addFirst(Integer.parseInt(st.nextToken()));
            } else if (cmd == 2) {
                sb.append(stack.isEmpty() ? -1 : stack.pollFirst()).append("\n");
            } else if (cmd == 3) {
                sb.append(stack.size()).append("\n");
            } else if (cmd == 4) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (cmd == 5) {
                sb.append(stack.isEmpty() ? -1 : stack.peekFirst()).append("\n");
            }
        }
        System.out.print(sb);
    }
}