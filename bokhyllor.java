import java.util.Scanner;

import static java.lang.System.in;

public class bokhyllor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int smallBooks = sc.nextInt();
        int mediumBooks = sc.nextInt();
        int largeBooks = sc.nextInt();
        int shelfWidth = sc.nextInt();

        int nbShelf = 0;
        while(smallBooks > 0 || mediumBooks > 0 || largeBooks > 0) {
            int currShelfWidth = shelfWidth;
            while(currShelfWidth >= 3 && largeBooks > 0) {
                currShelfWidth -= 3;
                largeBooks--;
            }
            while(currShelfWidth >= 2 && mediumBooks > 0) {
                currShelfWidth -= 2;
                mediumBooks--;
            }
            while(currShelfWidth >= 1 && smallBooks > 0) {
                currShelfWidth -= 1;
                smallBooks--;
            }
            nbShelf++;
        }
        if(nbShelf < 2) System.out.println(2);
        else System.out.println(nbShelf);
    }
}
