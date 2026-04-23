import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < m - 2; ) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                cnt++;
                i += 2;

                if (cnt == n) { // ex) cnt == n == 2, we find IOIOI
                    ans++;
                    cnt--;
                }
            } else {
                cnt = 0;
                i++;
            }
        }

        System.out.println(ans);
    }
}