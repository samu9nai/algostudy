import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        long sum = 0;
        long xor = 0;

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if (cmd == 1) {
                int x = Integer.parseInt(st.nextToken());
                sum += x;
                xor = xor ^ x;
            } else if (cmd == 2) {
                int x = Integer.parseInt(st.nextToken());
                sum -= x;
                xor = xor ^ x;
            } else if (cmd == 3) {
                sb.append(sum).append("\n");
            } else if (cmd == 4) {
                sb.append(xor).append("\n");
            }
        }

        System.out.print(sb);
    }
}