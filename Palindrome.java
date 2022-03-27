public class Palindrome {
    // Integer Palindrome 
        public boolean isPalindrome(int x) {
            if( x == 0 ) return true;
            if(x < 0 || x % 10 == 0) return false;
            
            int result = 0;
            int pop =0;
            while(x > result ){
      
                pop = x % 10;
    
                result = (result * 10) + pop ;
                x /= 10;
            }
            if(x == result || x == result /10){
                return true;
            }else{
                return false;
            }
      
    
            
        }
    }
