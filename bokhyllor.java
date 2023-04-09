import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class bokhyllor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int smallBooks = sc.nextInt();
        int mediumBooks = sc.nextInt();
        int largeBooks = sc.nextInt();
        int shelfWidth = sc.nextInt();

        long nbShelf = 0;
        int currShelfWidth;
        while(smallBooks > 0 || mediumBooks > 0 || largeBooks > 0) {
            nbShelf++;
            currShelfWidth = shelfWidth;
            while(currShelfWidth > 2 && largeBooks > 0) {
                currShelfWidth -= 3;
                largeBooks--;
            }
            while(currShelfWidth > 1 && mediumBooks > 0) {
                currShelfWidth -= 2;
                mediumBooks--;
            }
            while(currShelfWidth > 0 && smallBooks > 0) {
                currShelfWidth -= 1;
                smallBooks--;
            }
        }
        System.out.println(nbShelf);
    }
}