import java.io.*;
import java.util.*;

public class Main {
    static int[] point = {26, 14, 10, 6, 6, 4}; // 원래 점수의 2배

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int csum = 0;
        int esum = 3; // 후수 보정 1.5점 -> 2배해서 3점

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            csum += point[i] * Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            esum += point[i] * Integer.parseInt(st.nextToken());
        }

        if (csum > esum) {
            System.out.println("cocjr0208");
        } else {
            System.out.println("ekwoo");
        }
    }
}