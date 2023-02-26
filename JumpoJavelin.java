import java.util.Scanner;

import static java.lang.System.in;

public class JumpoJavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int len = sc.nextInt();
        int javelin = 0;
        int[] rods = new int[len];
        for(int i = 0; i < rods.length; i++) {
            rods[i] = sc.nextInt();
        }
        for(int i = 0; i < rods.length; i++) {
            if (i == 0) javelin += rods[i];
            else {
                javelin += rods[i] - 1;
            }
        }
        System.out.println(javelin);

    }
}
