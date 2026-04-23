import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());
            long wt = Long.parseLong(st.nextToken());
            long le = Long.parseLong(st.nextToken());
            long we = Long.parseLong(st.nextToken());
            long tele = lt * wt;
            long eure = le * we;

            if (tele > eure) {
                System.out.println("TelecomParisTech");
            } else if (tele == eure) {
                System.out.println("Tie");
            } else {
                System.out.println("Eurecom");
            }
        }
    }
}