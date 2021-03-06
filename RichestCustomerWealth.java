public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int result = 0;
        for(int i =0; i< accounts.length;i++){
            for(int j =0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            result = Math.max(result, sum  );
            sum =0;
        }
        return result;
    }
}
