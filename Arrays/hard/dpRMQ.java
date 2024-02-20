public class dpRMQ {
    private static int[][] precomputedRMQ(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        // Initialize dp array with base case (single element ranges)
        for (int i = 0; i < n; i++) {
            dp[i][i] = i;
        }

        // Build dp array using the recurrence relation
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                int left = dp[i][j - 1];
                int right = dp[i + 1][j];
                dp[i][j] = (arr[left] < arr[right]) ? left : right;
            }
        }

        return dp;
    }

    private static int queryRMQ(int[] arr, int[][] dp, int i, int j) {
        int index = dp[i][j];
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {23, 1, 45, 6, 78, 89, 45, 3, 1, 2, 9};

        // Precompute the RMQ table
        int[][] dp = precomputedRMQ(arr);

        // Query the minimum element for given ranges
        System.out.println("The min element in the range [2, 6] is: " + queryRMQ(arr, dp, 2, 6));
        System.out.println("The min element in the range [6, 10] is: " + queryRMQ(arr, dp, 6, 10));
    }
}
