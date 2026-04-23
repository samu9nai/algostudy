import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            double n = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double m = Double.parseDouble(st.nextToken());

            int cnt = 0;
            while (n <= m) {
                n *= (1 + b / 100.0);
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}