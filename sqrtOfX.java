public class sqrtOfX {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        int res = 0;

        while(l <= r){
            int mid = l + (r - l)/2;
            //int temp = x/mid;
            if(mid <= x/mid){
                l = mid + 1;
                res = mid;
         
            }else{
            r = mid - 1;
            }
        }
        return res;
    } 
}
