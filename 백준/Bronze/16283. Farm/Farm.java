import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (a * i + b * (n - i) == w) {
                cnt++;
                sb.append(i).append(" ").append(n - i);
            }
        }

        if (cnt == 1) System.out.println(sb);
        else System.out.println("-1");
    }
}