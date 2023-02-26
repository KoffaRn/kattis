import java.util.Scanner;

import static java.lang.System.in;

public class TurnItUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int volume = 7;
        int len = sc.nextInt() + 1;
        String[] command = new String[len];
        for(int i = 0; i < command.length; i++) {
            command[i] = sc.nextLine();
        }

        for(int i = 0; i < command.length; i++) {
            if(command[i].equals("Skru op!") && volume < 10) volume++;
            else if(command[i].equals("Skru ned!") && volume > 0) volume -= 1;
        }
        System.out.println(volume);
    }
}