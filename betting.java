import java.util.Scanner;

public class betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextInt();
        System.out.println(100 / p);
        System.out.println(100 / (100 - p));
    }
}
