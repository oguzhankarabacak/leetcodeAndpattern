package Math;

public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int counter = 0;
        for(int i = 1; i <= n; i++){
            int temp = i;
            while ( temp % 5 == 0){
                counter += 1;
                temp /= 5;
            }

        }
        return counter;
    }
}
