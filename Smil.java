import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Smil {
    static ArrayList<Integer> smiles = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String s = sc.nextLine();
        findString(s, ":-)");
        findString(s, ":)");
        findString(s, ";)");
        findString(s, ";-)");
        Collections.sort(smiles);
        for(Integer i : smiles) System.out.println(i);
    }

    static void findString(String str, String findStr) {
        int lastindex = 0;
        while(lastindex != -1) {
            lastindex = str.indexOf(findStr,lastindex);
            if(lastindex != -1) {
                smiles.add(lastindex);
                lastindex += 1;
            }
        }
    }
}
