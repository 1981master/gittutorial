public class MerageSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1 , right = n-1,flag = nums1.length-1;
        
        
        while(left >= 0 && right >= 0){
            if(nums1[left] > nums2[right]){
                nums1[flag] = nums1[left];
                left--;
                flag--;
            }else{
                nums1[flag] = nums2[right];
                right--;
                flag--;
            }
        }
        while(left >=0 || right >=0){
            if(left >= 0){
                nums1[flag] = nums1[left];
                left--;
                flag--;
            }
            if(right >= 0){
                nums1[flag] = nums2[right];
                right--;
                flag--;
            }
        }


    }
}
