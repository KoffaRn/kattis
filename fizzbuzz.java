import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        String fizzbuzz = "";
        for(int i = 1; i <= n; i++) {
            String str = "";
            if(i % a == 0) str += "Fizz";
            if(i % b == 0) str += "Buzz";
            if(i % a != 0 && i % b != 0) str += i;
            fizzbuzz  += str + "\n";
        }
        System.out.println(fizzbuzz);
    }
}
