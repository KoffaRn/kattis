import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Metronome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int rev = sc.nextInt();
        System.out.println((double) rev / 4);
    }
}
