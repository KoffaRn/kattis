import java.util.Scanner;
import static java.lang.System.in;
public class hey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String s = sc.nextLine();
        String output = "h";
        for(int i = 0; i < s.length() - 2; i++) {
            output += "ee";
        }
        output += "y";
        System.out.println(output);
    }
}