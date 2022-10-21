package Java_dz2;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 2 == 1) return false;
        if (n % 2 == 0) return isPowerOfTwo(n / 2);
        return true;
    }
}
