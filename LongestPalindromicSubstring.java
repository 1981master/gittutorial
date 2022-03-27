public class LongestPalindromicSubstring {
    int resultStart;
    int resultEnd;
    
    public String longestPalindrome(String s) {
     
        if(s.length() < 2) return s;
        
        for(int start = 0; start< s.length()-1;start++){
            expo(s,start,start);
            expo(s, start, start+1);
        }
        return s.substring(resultStart, resultEnd + resultStart);
    }
    public void expo(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if(resultEnd < end - start -1){
            resultStart = start+1;
            resultEnd = end - start -1;
        }
    }
}
