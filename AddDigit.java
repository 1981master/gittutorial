public class AddDigit {
    public static int addDigits(int num) {
       
        int ans = num;
        while(true){
            //second method it's does the same 
            //ans = helperString(ans);
            ans = helper(ans);
            System.out.println(helper(num)+" ans");
            if(ans < 10){
                break;
            }
        }
        return ans;
        
    }
    // helper method
    public static int helper(int num){
        int sum = 0;
        while(num != 0){
          
            sum += num %10;
            num =  num/10;
        }
        return sum;
    }
    
    
    public static int helperString(int no){
        int result =0;
        String noStr = no+"";
        for(char c:noStr.toCharArray()){
            result += (c - '0');
        }
        return result;
    }
    
    public static void main(String[] args){
  
        System.out.println(addDigits(38)+" slam");
        
    }
    
}
