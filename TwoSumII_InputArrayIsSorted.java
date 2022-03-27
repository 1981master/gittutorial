public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        if(l < 0){
            return numbers;
        }
        
        int start =0;
        int end = l-1;
        int result =0;
        while(start <= end){
            result = numbers[start] + numbers[end];
            if(result == target){
                return new int[]{start+1, end+1};
            }else if(result < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{start+1, end+1};
    }
}
