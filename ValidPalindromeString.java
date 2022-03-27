class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int length = s.length()-1;
        String result = s.replaceAll("[^a-zA-Z]", "").replaceAll("\\s+", "").toLowerCase();
        
        System.out.println(result);
        for(int i = 0;i< result.length()/2; i++){
            if(result.charAt(i) != result.charAt(result.length()-i-1)){
                return false;
            }    
            
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "slam-324212--===(*^%**_    mals";
        System.out.println(isPalindrome(s));
    }
}
class PalindromeII {
    public boolean validPalindrome(String s) {
     
        int pointer_a = 0;
        int pointer_b = s.length()-1;
        while(pointer_a <= pointer_b){
            if(s.charAt(pointer_a) != s.charAt(pointer_b)){
                return helper(s, pointer_a+1, pointer_b) || helper(s, pointer_a, pointer_b-1);
            }
            pointer_a++;
            pointer_b--;
        }
        return true;
        
    }
    public static boolean helper(String s , int pointer_a , int pointer_b){
 
        while(pointer_a <= pointer_b){
            if(s.charAt(pointer_a) != s.charAt(pointer_b)){
                return false;
            }
            pointer_a++;
            pointer_b--;
        }
        return true;
    }
        
        
}

