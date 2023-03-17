import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class stringmatching {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        while(sc.hasNextLine()) {
            String pat = sc.nextLine();
            String str = sc.nextLine();
            int index = str.indexOf(pat);
            while (index >= 0) {
                System.out.print(index + " ");
                index = str.indexOf(pat, index+1);
            }
            System.out.println();
        }
    }
}
