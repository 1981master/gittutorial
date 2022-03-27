public class PowerOfTow {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        long i =1;
        while(i < n){
            i *=2;
        }
        return i == n;
    }

}
