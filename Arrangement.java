import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Arrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int iRooms = sc.nextInt();
        int iTteams = sc.nextInt();
        int[] rooms = new int[iRooms];
        int index = 0;

        while(Arrays.stream(rooms).sum() < iTteams) {
            for(int i = 0; i < rooms.length; i++) {
                if(Arrays.stream(rooms).sum() < iTteams) rooms[i] += 1;
                else break;
            }
        }
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i]; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

