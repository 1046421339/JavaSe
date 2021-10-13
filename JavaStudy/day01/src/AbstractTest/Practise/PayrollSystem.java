package AbstractTest.Practise;

import java.util.Calendar;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[]employees=new Employee[2];
        employees[0]=new SalariedEmployee("JJ",01,new MyDate(2000,8,3),10000);
        employees[1]=new HourlyEmployee("li",02,new MyDate(2002,9,3),60,240);

        Calendar calendar=Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        System.out.println("本月是"+month+1);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            double price=employees[i].earnings();
            System.out.println(price);
        }
    }
}
