import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        List<Integer> sortedX = new ArrayList<>(set);
        sortedX.sort(Comparator.naturalOrder());

        for (int x : arr) {
            sb.append(Collections.binarySearch(sortedX, x)).append(" ");
        }

        System.out.println(sb);
    }
}