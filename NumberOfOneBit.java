public class NumberOfOneBit {
    public int hammingWeight(int n) {
        int count = 0;
        int manip = 1;
        for(int i =0;i<32; i++){
            if((n & manip) !=0 ){
                count++;
            }
            manip = manip << 1;
        }
        return count;
    }
}
