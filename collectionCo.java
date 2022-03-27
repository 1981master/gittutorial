import java.util.Collection;
import java.util.*;
public class collectionCo {
   
        public static int getLucky(String s, int k) {
            char[] cha =  s.toCharArray();
            int length = cha.length;
            
            char c = ' ';
            double sum = 0;
            for(int i =0; i< length;i++){
                

                c = cha[i];
                sum *= 10;
                sum += c-96;
                
            }
            //System.out.println(sum+" sum");
            while(k > 0){
               sum = helper(sum);
                k--;
            }
            return (int)sum;
        }
        public static int helper(double x){
            int result =0;
            while(x > 0){
                
                result += x % 10;
                
                x /= 10;
              
                
            }
            System.out.println(result+" result");
            return result;
        }
   public static void main(String[] args) {
       System.out.println(getLucky("hvmhoasabaymnmsd",1));
   }

}
