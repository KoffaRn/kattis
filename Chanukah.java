import java.util.Scanner;

import static java.lang.System.in;

 class Chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int p = sc.nextInt();
        int[][] k = new int[p][2];
        int candles = 0;
        for(int i = 0; i < p; i++) {
            k[i][0] = sc.nextInt();
            k[i][1] = sc.nextInt();
        }
        for(int i = 0; i < k.length; i++) {
            int days = 1;
            while(days <= k[i][1]) {
                candles += days + 1;
                days++;

            }
            System.out.println(k[i][0] + " " + candles);
            candles = 0;
        }
    }
}
