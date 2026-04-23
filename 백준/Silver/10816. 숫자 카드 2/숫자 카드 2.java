import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(arrayList);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arrayList, x) - lowerBound(arrayList, x)).append(" ");
        }

        System.out.println(sb);
    }

    static int lowerBound(ArrayList<Integer> arrayList, int key) {
        int left = 0;
        int right = arrayList.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (arrayList.get(mid) < key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }

    static int upperBound(ArrayList<Integer> arrayList, int key) {
        int left = 0;
        int right = arrayList.size();

        while (left < right) {
            int mid = (left + right) / 2;

            if (arrayList.get(mid) <= key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }
}