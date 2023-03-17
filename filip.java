import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

import static java.lang.System.in;

public class filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aRev = reverseNumber(a);
        int bRev = reverseNumber(b);

        if(aRev > bRev) System.out.println(aRev);
        else System.out.println(bRev);


    }
    static int reverseNumber(int value) {
        int resultNumber = 0;
        for(int i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }
}
