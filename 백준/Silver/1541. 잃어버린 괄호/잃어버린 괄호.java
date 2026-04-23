import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expr = br.readLine();

        String[] minusParts = expr.split("-");
        int answer = sumGroup(minusParts[0]);

        for (int i = 1; i < minusParts.length; i++) {
            answer -= sumGroup(minusParts[i]);
        }

        System.out.println(answer);
    }

    static int sumGroup(String plusString) {
        String[] plusParts = plusString.split("\\+");
        int sum = 0;

        for (String num : plusParts) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}