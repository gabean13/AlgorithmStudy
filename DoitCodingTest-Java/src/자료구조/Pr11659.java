package 자료구조;

import java.util.Scanner;

public class Pr11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //수의 갯수
        int M = sc.nextInt();   //합을 계산할 횟수

        int num[] = new int[N+1];
        int sum[] = new int[N+1];

        for (int i = 1; i < N+1; i++) {
            num[i] = sc.nextInt();
            sum[i] = sum[i - 1] + num[i];
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum[b] - sum[a - 1]);
        }
        sc.close();
    }
}
