import java.util.Scanner;

import static java.lang.System.in;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        int problems = 0;
        if(input.contains(";")) {
            String[] arrInput = input.split(";");

            for(int i = 0; i < arrInput.length; i++) {
                if(arrInput[i].contains("-")) {
                    String[] arr1 = arrInput[i].split("-");
                    problems += Integer.valueOf(arr1[1]) - Integer.valueOf(arr1[0]) + 1;
                }else problems += 1;

            }
        }else if (input.contains("-")) {
            String[] arr1 = input.split("-");
            problems += Integer.valueOf(arr1[1]) - Integer.valueOf(arr1[0]) + 1;
        }else problems = 1;
        System.out.println(problems);

    }
}
