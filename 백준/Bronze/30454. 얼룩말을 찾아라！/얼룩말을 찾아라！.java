import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int beauty = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String zebra = br.readLine();
            StringTokenizer stZebra = new StringTokenizer(zebra, "0");
            int cur = stZebra.countTokens();
            
            if (cur > beauty) {
                beauty = cur;
                cnt = 1;
            } else if (cur == beauty) {
                cnt++;
            }
        }

        System.out.println(beauty + " " + cnt);
    }
}