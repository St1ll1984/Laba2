public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        int s = 0;
        if (n == 0){
            throw new IllegalArgumentException("Is not zero");
        }
        else {
            if (n==1){
                s = n;
            }
            else{
                for (int i = 1; i < n; i++) {s = s + n;}
            }
            return s;
        }
    }
}
