import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (k < n + m - 1) {
            System.out.println("NO");
            return;
        }
        sb.append("YES\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(i + j + 1).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}