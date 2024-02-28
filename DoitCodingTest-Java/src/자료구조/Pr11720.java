package 자료구조;

import java.util.Scanner;

public class Pr11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int N = sc.nextInt();
        String inputValue = sc.next();
        for (int i = 0; i < N; i++) {
            int value = Character.getNumericValue(inputValue.charAt(i));
            sum += value;
        }

        System.out.println(sum);
        sc.close();
    }
}
