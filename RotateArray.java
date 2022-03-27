public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotateIt(nums, 0, nums.length-1);
        rotateIt(nums,0, k-1);
        rotateIt(nums,k,nums.length-1);
        
    }
    public void rotateIt(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
