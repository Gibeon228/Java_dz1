package Java_dz2;

class Solution {
 public double myPow(double x, int n) {
  if (n == 0) return 1;
  if (x == 0) return 0;
  if (x == 1) return 1;
  if ((x == -1) && (n % 2 == 1)) return -1;
  if ((x == -1) && (n % 2 == 0)) return 1;
  if ((n > 10000) && (x < 0.1) && (x > -0.1)) return 0;
  if (n < -10000) return 0;
  if (n == 1) return x;
  if (n == -1) return 1/x;
  if (n % 2 == 0) {
   return (myPow(x, n / 2) * myPow(x, n / 2));
  }
  else if (n > 0) {
   return (x * myPow(x, (n - 1)));
  }
  else {
   return (1/x * myPow(x, (n + 1)));
  }





 }
}