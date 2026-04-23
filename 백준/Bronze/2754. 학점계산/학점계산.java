import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> gpa = new HashMap<>();
        gpa.put("A+", 4.3);
        gpa.put("A0", 4.0);
        gpa.put("A-", 3.7);
        gpa.put("B+", 3.3);
        gpa.put("B0", 3.0);
        gpa.put("B-", 2.7);
        gpa.put("C+", 2.3);
        gpa.put("C0", 2.0);
        gpa.put("C-", 1.7);
        gpa.put("D+", 1.3);
        gpa.put("D0", 1.0);
        gpa.put("D-", 0.7);
        gpa.put("F", 0.0);

        String str = br.readLine();
        System.out.println(gpa.get(str));
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}