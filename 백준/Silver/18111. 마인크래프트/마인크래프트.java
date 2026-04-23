import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] gnd = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                gnd[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int bestTime = Integer.MAX_VALUE;
        int bestHeight = 0;

        for (int h = 0; h <= 256; h++) {
            int toRemove = 0;
            int toAdd = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int cur = gnd[i][j];

                    if (cur > h) {
                        toRemove += cur - h;
                    } else if (cur < h) {
                        toAdd += h - cur;
                    }
                }
            }

            if (toRemove + b >= toAdd) { // to add blocks, need removed blocks + blocks already in inventory
                int time = toRemove * 2 + toAdd; // remove -> 2sec, add -> 1sec

                if (time < bestTime || (time == bestTime && h > bestHeight)) { // shortest time or tallest height
                    bestTime = time;
                    bestHeight = h;
                }
            }
        }

        System.out.println(bestTime + " " + bestHeight);
    }
}