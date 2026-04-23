import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = { br.readLine(), br.readLine(), br.readLine() };
        int n = 0;

        for (int i = 0; i < 3; i++) {
            if (!str[i].equals("Fizz") && !str[i].equals("Buzz") && !str[i].equals("FizzBuzz")) {
                n = Integer.parseInt(str[i]) + (3 - i); // 4th number
                break;
            }
        }

        if (n % 15 == 0) System.out.println("FizzBuzz");
        else if (n % 3 == 0) System.out.println("Fizz");
        else if (n % 5 == 0) System.out.println("Buzz");
        else System.out.println(n);
    }
}