public class Matrix_01 {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
       int maxCase = mat.length-1 + mat[0].length-1;
       
       for(int i=0;i<mat.length;i++){
           for(int j =0;j<mat[0].length;j++){
               if(mat[i][j] != 0){
                   int upCell = (i > 0 ) ? result[i-1][j]: maxCase;
                   int leftCell = (j > 0 ) ? result[i][j-1]: maxCase;
                   result[i][j] = Math.min(upCell, leftCell)+1;  
               }

           }
       }
           for(int i =mat.length-1;i>=0;i--){
               for(int j = mat[i].length-1;j>=0;j--){
                   if(mat[i][j] != 0){
                       int downCell = (i < mat.length-1) ? result[i+1][j]: maxCase;
                       int rigthCell = (j < mat[0].length-1) ? result[i][j+1]: maxCase;
                       result[i][j] = Math.min(Math.min(downCell, rigthCell)+1, result[i][j]);  
                   }
                   
               }
           }
       
       return result;
   }
}
