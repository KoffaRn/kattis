import java.util.Scanner;

import static java.lang.System.in;

 class FYI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String s = sc.nextLine();
        char[] sarray = s.toCharArray();
        if(sarray[0] == '5' && sarray[1] == '5' && sarray[2] == '5') System.out.println("1");
        else System.out.print("0");
    }
}
