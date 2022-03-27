public class SumofAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int result =0;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int start = n-i;
            int end = i +1;
            int total = start * end;
            int oddN = total /2;
            if(total % 2 == 1){
                oddN++;
            }
            result += oddN * arr[i];
        }
        return result;
    }
}
