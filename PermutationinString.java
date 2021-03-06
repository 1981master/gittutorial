import java.util.Arrays;

public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int x = s1.length(), y = s2.length();
        if(x == 0 || y < x) return false;
        
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        
        for(int i=0; i<x ;i++){
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }
        // int start =l1;
        // int end = l2;
        for(int i = x; i < y; i++){
            if(Arrays.equals(array1, array2)){
                return true;
            }
            array2[s2.charAt(i - x) - 'a']--;
            array2[s2.charAt(i) - 'a']++;
            // start++;
            // end++;
        }
        if(Arrays.equals(array1, array2)){
            return true;
        }else{
            return false;
        }
    } 
}
