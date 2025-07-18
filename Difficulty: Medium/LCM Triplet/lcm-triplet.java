class Solution {
    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    int lcmTriplets(int n) {
        if (n <= 2) return n;
        if (n == 3) return 6;

        long result = 0;

        // If n is odd, try n, n-1, n-2
        if (n % 2 != 0) {
            result = lcm(lcm(n, n - 1), n - 2);
        } else {
            // If n is even, try n, n-1, n-3 and n-1, n-2, n-3
            result = Math.max(lcm(lcm(n, n - 1), n - 3), lcm(lcm(n - 1, n - 2), n - 3));
            // If n is divisible by 3, n*(n-1)*(n-2) may not be best due to common divisors
            // Also try n*(n-1)*(n-3), which may be better
        }

        return (int) result;
    }
}