package matrices;

public class TopelizOrNot {

    public static void main(String[] args) {
        int[][] a = {
            {2, 3, 4},
            {4, 1, 3},
            {5, 4, 2}
        };

        boolean isToeplitz = isTopelitz(a);
        System.out.println("Is Toeplitz: " + isToeplitz);
    }

    public static boolean isTopelitz(int[][] a) {
        int m = a.length;
        int n = a[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] != a[i-1][j-1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
