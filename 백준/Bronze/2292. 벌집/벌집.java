import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        
        while ((3 * cnt * (cnt - 1) + 1) < n) {
            cnt++;
        }

        System.out.println(cnt);
    }
}