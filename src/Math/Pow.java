package Math;

public class Pow {
    public double myPow(double x, int n) {
        double result = 1.0;
        long n_new = n;
        if (n == 0 || x == 1.0){
            return 1.0;
        }
        if (x == -1.0){
            if (n % 2 == 0) return 1.0;
            if (n % 2 == 1) return -1.0;
        }
        else if (n_new < 0) {
           while (n_new < 0) {
               result /= x;
               n_new += 1;
               if (result == 0.0){
                   return  result;
               }
           }
           return result;

        }
        while (n_new > 0) {
            result *= x;
            n_new -= 1;
        }
        return result;

    }
}
