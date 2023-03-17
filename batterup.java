import java.util.Scanner;

import static java.lang.System.in;

public class batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        double[] bats = new double[n];
        for(int i = 0; i < n; i++) {
            bats[i] = sc.nextInt();
        }
        double sum = 0;
        int total = 0;
        for(double i : bats) {
            if(i < 0) continue;
            sum += i;
            total++;
        }
        System.out.println(sum / (double) total);
    }
}
