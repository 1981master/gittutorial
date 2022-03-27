public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int l1 = word1.length();
        int l2 = word2.length();
        
        // if(word1.length() < word2.length()){
        //     return mergeAlternately(word2, word1);
        // }
        //int i = 0;
        if(l1 < l2){ 
            int i =0;
            for(;i< l1;i++){
                result += word1.charAt(i)+""+ word2.charAt(i)+"";
                             
            }
            result += word2.substring(i,word2.length()); 
        }else{
            int i = 0;
            for(; i< l2;i++){
                if(i < l1){
                    result += word1.charAt(i)+""+  word2.charAt(i)+"";
                }          
            }
            result += word1.substring(i,word1.length());
        }

        
        return result;
    }
}
