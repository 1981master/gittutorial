public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        
        int low =0;
        int high =1;
        
        while(low < nums.length && high < nums.length && low < high ){
            if(nums[low] == 0 && nums[high] != 0 ){
                nums[low] = nums[high];
                nums[high] = 0;
                low++;
                high++;
            }else{
                if(nums[low] != 0)
                    low++;
                high++;
            }
        }
        
/*
    public void moveZeroes(int[] nums) {

        for(int i =0,j=0;j< nums.length && i<nums.length;j++){
       
            if( nums[j] !=0){
                int temp = nums[i];
                nums[i++] = nums[j]; 
                nums[j] = temp;
        
            }
        }
    }
*/
        
        
        
        
        
        
        
        // for(int i=1;i<nums.length;i++){
        //     for(int j=1;j<nums.length;j++){
        //         if(nums[j] != 0 && nums[j-1] == 0){
        //             nums[j-1] = nums[j];
        //             nums[j] = 0;
        //         }
        //     }
        // }
    }
}
