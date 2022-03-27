public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int[] result = new int[nums.length];
        int i =nums.length-1;
        
        while(low <= high){
            if(Math.pow(nums[low], 2) > Math.pow(nums[high], 2)){
                result[i] = (int)Math.pow(nums[low], 2);
                low++;
                i--;
            }else{
                result[i] = (int)Math.pow(nums[high], 2);
                high--;
                i--;
            }   
        }
        return result;
    }
}
