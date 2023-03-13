import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class OneDFrogger {
    static ArrayList<Integer> visited = new ArrayList<>();
    static int[] inputs = new int[3];
    static int[] board;
    static int moves = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        inputs = new int[3];
        for(int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }
        int boardLength = inputs[0];
        int position = inputs[1];
        int magic = inputs[2];

        board = new int[inputs[0]];

        for(int i = 0; i < boardLength; i++) {
            board[i] = sc.nextInt();
        }
        move(position, board);
    }
    static void move(int position, int[] board) {
        while(isCycle(position) == false) {
            int move = board[position - 1];
            if(isMagic(position)) {
                System.out.println("magic");
                System.out.println(moves);
                exit(0);

            }
            else if(outOfBounds(position, move).equals("right")) {
                System.out.println("right");
                System.out.print(moves);
                exit(0);
            }
            else if(outOfBounds(position, move).equals("left")) {
                System.out.println("left");
                System.out.println(moves);
                exit(0);
            }
            visited.add(position);
            position += move;
            moves += 1;

        }
        System.out.println("cycle");
        System.out.println(moves);
        exit(0);
    }
    static String outOfBounds(int position, int move) {
        if(position + move > 0 && position + move <= inputs[0]) return "in";
        else if(position + move <= 0) return "left";
        else if(position + move > board[0]) return "right";
        return null;
    }
    static boolean isMagic(int position) {
        if(board[position -1] == inputs[2]) return true;
        else return false;
    }
    static boolean isCycle(int position) {
        if(visited.contains(position)) return true;
        else return false;
    }

}
