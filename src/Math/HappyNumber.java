package Math;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public boolean isHappy(int n) {
        int result = square(n);
        List<Integer> prevResults = new ArrayList<>();
        prevResults.add(result);
        while (result != 1){
            result = square(result);
            if (prevResults.contains(result)){
                return false;
            }
            prevResults.add(result);

        }
        return true;
    }
    public int square(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
