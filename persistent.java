import java.util.ArrayList;
import java.util.Scanner;

public class persistent {
    public static void main(String[] args) {
        System.out.println(zeroFilledSubarray(new int[]{1, 3, 0, 0, 2, 0, 0, 4}));
    }
    public static long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int c = 0;
        for(int i : nums) {
            if(i == 0) {
                c += 1;
                ans += 1;
            }
            else {
                c = 0;
            }
        }
        return ans;
    }
}