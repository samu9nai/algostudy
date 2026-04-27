import java.io.*;
import java.util.*;

public class Main {
    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] fact = new long[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        long numerator = fact[n];
        long denominator = fact[k] * fact[n - k] % MOD;

        long inverseDenominator = pow(denominator, MOD - 2);

        long answer = numerator * inverseDenominator % MOD;

        System.out.println(answer);
    }

    static long pow(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = result * base % MOD;
            }

            base = base * base % MOD;
            exp /= 2;
        }

        return result;
    }
}