import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        double rprime = r / 255.0;
        double gprime = g / 255.0;
        double bprime = b / 255.0;

        double k = 1.0 - Math.max(Math.max(rprime, gprime), bprime);

        double c, m, y;

        if (k == 1.0) {
            c = 0.0;
            m = 0.0;
            y = 0.0;
        } else {
            c = (1.0 - rprime - k) / (1.0 - k);
            m = (1.0 - gprime - k) / (1.0 - k);
            y = (1.0 - bprime - k) / (1.0 - k);
        }
        System.out.println(c + " " + m + " " + y + " " + k);
    }
}