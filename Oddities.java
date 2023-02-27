import java.util.Scanner;

import static java.lang.System.in;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] test = new int[n];
        for(int i = 0; i < n; i++) {
            test[i] = sc.nextInt();
        }
        for(int i : test) {
            if(isEven(i)) System.out.println(i + " is even");
            else System.out.println(i + " is odd");
        }

    }
    static boolean isEven(int i) {
        if(i % 2 == 0) return true;
        else return false;
    }
}
