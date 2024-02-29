package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] num = new int[N+1][N+1];
        int[][] sum = new int[N+1][N+1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j < N + 1; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                sum[i][j] = num[i][j] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];      //(1,1)부터 (i,j)인 오른쪽 모서리까지의 합
            }
        }

        int x1, x2, y1, y2;
        for(int i = 0; i < M;i++){
            st = new StringTokenizer(bf.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            System.out.println(sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1]);
        }
    }
}
