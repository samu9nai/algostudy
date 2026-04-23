import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (d < 11 || (d == 11 && h < 11) || (d == 11 && h == 11 && m < 11)) {
            System.out.println(-1);
        } else {
            System.out.println((d - 11) * 1440 + (h - 11) * 60 + (m - 11));
        }
    }
}