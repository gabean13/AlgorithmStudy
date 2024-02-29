package 자료구조;

import java.util.Scanner;

public class Pr1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double RealTotalScore = 0L;
        double max = 0L;

        double N = sc.nextDouble();
        for (int i = 0; i < N; i++) {
            double currentScore = sc.nextDouble();
            RealTotalScore += currentScore;
            if(max < currentScore){
                max = currentScore;
            }
        }

        System.out.println(RealTotalScore / max * 100.0  / N);

        sc.close();

    }
}
