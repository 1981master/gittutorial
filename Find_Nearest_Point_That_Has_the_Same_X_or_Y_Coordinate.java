public class Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int manh = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<points.length;i++){
            if(points[i][0] == x || points[i][1] == y){
                int num = Math.abs(x - points[i][0])+ Math.abs(y-points[i][1]);
                if(num < manh){
                    manh = num;
                    index = i;
                }
            }
        }
        return index;
    }
}
