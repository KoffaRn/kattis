import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        ArrayList<String> input = new ArrayList<>();
        int currentSet = 1;
        input.add(sc.nextLine());
        while(true) {
            if(input.get(input.size() - 1).equals("0")) {
                break;
            }else input.add(sc.nextLine());
        }
        for(int i = 0; i < input.size(); i++) {
            ArrayList<String> currentArray = new ArrayList<>();
            if (isNumeric(input.get(i)) == true) {
                int intValue = Integer.parseInt(input.get(i));
                int oldInt = i;
                for(int j = 0; j <= intValue; j++) {
                    if(isNumeric(input.get(i)) == false) currentArray.add(input.get(i));
                    i++;

                }
                i = oldInt;
                if(currentArray.size() > 0) {
                    ArrayList<String> oddList = new ArrayList<>();
                    ArrayList<String> evenList = new ArrayList<>();
                    int tmpval = 0;
                    for(String s : currentArray) {
                        if(tmpval % 2 != 0) {
                            oddList.add(currentArray.get(tmpval));
                        }
                        else{
                            evenList.add(currentArray.get(tmpval));
                        }
                        tmpval += 1;
                    }

                    System.out.println("SET " + currentSet);
                    for(String s : evenList) System.out.println(s);
                    for(int k = oddList.size() - 1; k >= 0; k--) {
                        System.out.println(oddList.get(k));
                    }

                    currentSet++;
                }


                currentArray.clear();
            }

        }

    }
    public static boolean isNumeric(String string) {
        int intValue;
        if(string == null || string.equals("")) {
            return false;
        }
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}

