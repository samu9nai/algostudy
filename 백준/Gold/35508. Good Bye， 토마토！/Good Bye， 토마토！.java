import java.io.*;
import java.util.*;

public class Main {
    static class Dish {
        long t, a, b;
        int idx;

        Dish(long t, long a, long b, int idx) {
            this.t = t;
            this.a = a;
            this.b = b;
            this.idx = idx;
        }
    }

    static class Best {
        long value;
        int idx;

        Best(long value, int idx) {
            this.value = value;
            this.idx = idx;
        }
    }

    static int N;
    static long D;
    static Dish[] dishes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        D = Long.parseLong(st.nextToken());

        dishes = new Dish[N];

        long answer = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            long t = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            dishes[i] = new Dish(t, a, b, i);

            answer = Math.max(answer, a + b);
        }

        Arrays.sort(dishes, Comparator.comparingLong(o -> o.t));

        Best[] prefixBest1 = new Best[N];
        Best[] prefixBest2 = new Best[N];

        Best best1 = new Best(-1, -1);
        Best best2 = new Best(-1, -1);

        for (int i = 0; i < N; i++) {
            Dish cur = dishes[i];

            if (cur.a > best1.value) {
                best2 = best1;
                best1 = new Best(cur.a, cur.idx);
            } else if (cur.a > best2.value) {
                best2 = new Best(cur.a, cur.idx);
            }

            prefixBest1[i] = new Best(best1.value, best1.idx);
            prefixBest2[i] = new Best(best2.value, best2.idx);
        }

        for (int j = 0; j < N; j++) {
            Dish cur = dishes[j];

            long remain = D - cur.t;

            int pos = upperBound(dishes, remain) - 1;

            if (pos < 0) continue;

            Best candidate = prefixBest1[pos];

            if (candidate.idx == cur.idx) {
                candidate = prefixBest2[pos];
            }

            if (candidate.idx == -1) continue;

            answer = Math.max(answer, candidate.value + cur.b);
        }

        System.out.println(answer);
    }

    static int upperBound(Dish[] arr, long target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid].t <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}