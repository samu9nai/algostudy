import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 10000;
    static int[] queue = new int[MAX];
    static int front = 0, rear = 0;

    static void push(int x) {
        queue[rear++] = x;
    }

    static int pop() {
        return queue[front++];
    }

    static int size() {
        return rear - front;
    }

    static boolean empty() {
        return front == rear;
    }

    static int front() {
        return queue[front];
    }

    static int back() {
        return queue[rear - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    push(x);
                    break;

                case "pop":
                    if (empty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(pop()).append("\n");
                    }   break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    if (empty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }   break;

                case "front":
                    if (empty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(front()).append("\n");
                    }   break;

                case "back":
                if (empty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(back()).append("\n");
                    }   break;


                default:
                    break;
            }
        }

        System.out.println(sb);

    }
}