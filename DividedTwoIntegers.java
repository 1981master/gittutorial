public class DividedTwoIntegers {
    public int divide(int dividend, int divisor) {
        long result = (long)dividend/(long)divisor;
        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE ;
        }
        if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE ;
        }
        return (int)result;
    }
}
