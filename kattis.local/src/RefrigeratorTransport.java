import java.util.*;

public class RefrigeratorTransport {
    static int[] dr = {-2, -2, 2, 2, 1, -1, 1, -1}; // row movements
    static int[] dc = {1, -1, 1, -1, 2, 2, -2, -2}; // column movements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        boolean[][] visited = new boolean[n][n];

        // Reading the input grid
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = row.charAt(j);
            }
        }

        // Starting position of the knight
        int sr = 0, scol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'K') {
                    sr = i;
                    scol = j;
                    break;
                }
            }
        }

        // BFS to find the shortest path
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(sr, scol, 0));
        visited[sr][scol] = true;

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr.r == 0 && curr.c == 0) {
                System.out.println(curr.steps);
                return;
            }

            // Check all possible moves
            for (int i = 0; i < 8; i++) {
                int nr = curr.r + dr[i];
                int nc = curr.c + dc[i];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n || visited[nr][nc] || grid[nr][nc] == '#')
                    continue;

                visited[nr][nc] = true;
                queue.add(new Node(nr, nc, curr.steps + 1));
            }
        }

        System.out.println("-1"); // Unreachable
    }
}

class Node {
    int r, c, steps;

    public Node(int r, int c, int steps) {
        this.r = r;
        this.c = c;
        this.steps = steps;
    }
}