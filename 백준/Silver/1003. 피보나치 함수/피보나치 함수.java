import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int fibo[][] = new int[41][2];
        fibo[0][0] = fibo[1][1] = 1; 

        for (int i = 2; i <= 40; i++) {
            fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0]; // cnt of 0
            fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1]; // cnt of 1
        }

        int t = Integer.parseInt(br.readLine()); 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(fibo[n][0]).append(" ").append(fibo[n][1]).append("\n");
        }

        System.out.println(sb);
    }
}