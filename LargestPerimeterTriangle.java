import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        int i =nums.length-1;
        int j = i-1;
        int k = j-1;
        Arrays.sort(nums);
        while(k >= 0){
                   
            if(nums[i] + nums[j] <= nums[k] || nums[i] + nums[k] <= nums[j] || nums[j] + nums[k] <= nums[i]  ){
                i--;
                j--;
                k--;
            }else{
                return nums[i] + nums[j] + nums[k] ;
            }
        }
      return 0; 
    }
}
