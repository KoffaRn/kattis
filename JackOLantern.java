import java.util.Scanner;

import static java.lang.System.in;

public class JackOLantern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] input = new int[3];
        for(int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        int combinations = input[0] * input[1] * input[2];
        System.out.println(combinations);
    }
}
