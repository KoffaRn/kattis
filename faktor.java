import java.util.Scanner;

import static java.lang.System.in;

public class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        b -= 1;
        System.out.println((int) (a * b +1));
    }
}
