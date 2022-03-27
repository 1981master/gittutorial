import java.util.HashMap;

public class FindTheDifferences {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(Character c: t.toCharArray()){
            if(map.containsKey(c) && map.get(c) == 0 || !map.containsKey(c)){
                return  c;
            }
            map.put(c,map.get(c) -1);
        }
        return ' ';
    }
}
