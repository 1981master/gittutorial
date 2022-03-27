// import java.util.*;

// public class HappyNumber {
//     public boolean isHappy(int n) {
//         Set<Integer> set = new HashSet<>();
//         boolean result = false;
//         int ans = n;

//         while(true){
//             ans = helper(ans);
//             if(set.contains(ans)){
//                 return false;
//             }else{
//                 set.add(ans);
//             }
//             if(ans == 1){
//                 result = true;
//                 break;
//             }
        
            
//         }
//         return result;
//     }
//     public int helper(int n){
//         int sum = 0;
//         int cum = 0;
//         while(n != 0){
//             cum += n % 10;
            
//             sum += Math.pow(cum,2);
//             n /= 10;
//             cum = 0;
//         }
//         return sum;
//     }
 
// }
