import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class julmust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int high = sc.nextInt();
        int low = 0;
        int step = 1;
        System.out.println((low + high) / 2);
        System.out.flush();
        while(true) {
            Scanner sc1 = new Scanner(in);
            String verdict = sc1.nextLine();
            step += 1;
            if(verdict.equals("less")) high = (low + high) / 2 - 1;
            else if(verdict.equals("more")) low = (low + high) / 2 + 1;
            else if(verdict.equals("exact")) exit(0);
            low *= step/(step -1);
            high *= step/(step-1);
            System.out.println((low + high) / 2);
            System.out.flush();
        }
    }
}
