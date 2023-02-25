import java.util.*;

class NewAnts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int L = sc.nextInt();
            int n = sc.nextInt();
            int[] ants = new int[n];

            for (int i = 0; i < n; i++) {
                ants[i] = sc.nextInt();
            }

            int earliestTime = 0;
            int latestTime = 0;

            for (int i = 0; i < n; i++) {
                int minTime = Math.min(ants[i], L - ants[i]);
                earliestTime = Math.max(earliestTime, minTime);
                latestTime = Math.max(latestTime, Math.max(ants[i], L - ants[i]));
            }

            System.out.println(earliestTime + " " + latestTime);
        }
    }
}