import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        //int min = salary[0];
        //int max = salary[salary.length-1];
        double sum =0.0;
        int i=1;
        for(;i<salary.length-1;i++){
            sum += salary[i];
        }
        //System.out.println(i);
        double avg = sum / (i-1);
    return avg;
    } 
}
