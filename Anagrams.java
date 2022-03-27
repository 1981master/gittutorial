import java.util.Arrays;

public class Anagrams {
    public boolean isAnagram(String s, String t) {
        
        if(helper(s).equals(helper(t))){
            return true;
        }
        return false;
        
    }
    public String helper(String str){
        char[] cha = str.toCharArray();
        Arrays.sort(cha);
        String result = new String(cha);
        return result;
    }
}
