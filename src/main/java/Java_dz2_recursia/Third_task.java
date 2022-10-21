package Java_dz2;

class Solution {
    public int climbStairs(int n) {
        if (n < 4) return n;
        if (n == 4) return 5;
        if (n == 5) return 8;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}