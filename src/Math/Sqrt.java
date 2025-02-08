package Math;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1;
        int right = x;

        int ans = 0;
        while (left < right) {
            int mid = left + (left + right) / 2;
            long square = (long) mid * mid;

            if (square == x){
                return mid;
            }
            else if (square < x){
                ans = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
