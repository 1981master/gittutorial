import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li = new ArrayList();
        Map<String, List<String>> map = new HashMap();
        
     
        for(String current: strs){
            char[] cha = current.toCharArray();
            Arrays.sort(cha);
            String sorted = new String(cha);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList());
            }
                map.get(sorted).add(current);
            
           
            
        }
         li.addAll(map.values());
        return li;
     
    } 
}
