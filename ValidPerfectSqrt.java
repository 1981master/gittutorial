public class ValidPerfectSqrt {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long l = 1;
        long r = num;
        
        while(l <= r){
            long mid = l + (r - l)/2;
            long result = mid * mid;
            if(result == num ){
                return true;
            }else if(result < num){
                l = mid+1;
            }else{
                r = mid -1;
            }
            
        }
        return false;
    }
}
