
public class SalaryCalculate {
    public static void main(String[] args) {
        double salary = salaryCalculate(40, 15 , 8);
        System.out.println(salary);
    }

    public static double salaryCalculate(double hoursPerWeek, 
                                         double amountPerHours,
                                         int vacationDays) {
        
        if (hoursPerWeek < 0) {
            return -1;
        }                                            

        if (amountPerHours < 0) {
            return -1;
        }

        double weeklyPaidCheck = hoursPerWeek * amountPerHours;
        double unpaidTime =  vacationDays * amountPerHours * 8 ;
        return (weeklyPaidCheck * 52) - unpaidTime;
    }
}