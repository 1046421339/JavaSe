package AbstractTest.Practise;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary=monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee"+"Employee"+super.toString();
    }
}
