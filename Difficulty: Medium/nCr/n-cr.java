class Solution {
    public long nCr(int n, int r) {
        // Edge cases
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;

        // Optimization
        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }
}