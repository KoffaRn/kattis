import java.util.Scanner;

import static java.lang.System.in;

public class apaxiaaans {
    public static void main(String[] args) {
        char lastLetter = 0;
        Scanner sc = new Scanner(in);
        String name = sc.nextLine();
        String str = "";
        for(int i = 0; i < name.length(); i++) {
            if(lastLetter == name.charAt(i)) {
                lastLetter = name.charAt(i);
                continue;
            }
            lastLetter = name.charAt(i);
            str += name.charAt(i);
        }
        System.out.println(str);
    }
}
