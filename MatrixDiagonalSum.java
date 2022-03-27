public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i == j){
                    sum += mat[i][j];
                }
            }
            if(mat.length % 2 != 0 && i != mat.length/2){
               sum += mat[i][mat[i].length -1-i]; 
            }else if(mat.length % 2 == 0){
                sum += mat[i][mat[i].length -1-i];
            }

        }
        return sum;
    }
}
