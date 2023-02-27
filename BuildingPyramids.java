import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class BuildingPyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int blocks = sc.nextInt();
        int base = 1;
        int floorsBuilt = 1;
        //Edge cases, you cant build more than one floor
        if(blocks < 0) {System.out.println(0); exit(0); }
        else if (blocks < 9) {System.out.println(1); exit(0);}

        while(true) {
            blocks -= addFloor(base);
            base += 2;
            if(blocks < addFloor(base)) break;
            floorsBuilt += 1;
        }


        System.out.println(floorsBuilt);
    }
    static int addFloor(int base) {
        int blocksUsed = base * base;

        return blocksUsed;
    }
}
