import java.util.Scanner;

import static java.lang.System.in;

class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //Inputed pieces
        int[] pieces = new int[6];
        //Pieces in correct chess set
        int[] correctPieces = {1, 1, 2, 2, 2, 8};
        //Place to store difference between pieces and correctPieces
        int[] piecesDiff = new int[6];
        //Take 6 inputs in for-loop
        for(int i = 0; i < pieces.length; i++) pieces[i] = sc.nextInt();
        //loop through input and compare to correct

        for(int i = 0; i < correctPieces.length; i++) {
            if(pieces[i] < correctPieces[i]) {
                pieces[i] = correctPieces[i] - pieces[i];
            }else if(pieces[i] > correctPieces[i]) {
                pieces[i] -= correctPieces[i];
                pieces[i] = -pieces[i];
            }else pieces[i] = 0;
        }
        for (int i : pieces) {
            System.out.print(i + " ");
        }
    }
}
