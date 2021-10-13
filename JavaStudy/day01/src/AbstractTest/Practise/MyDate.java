package AbstractTest.Practise;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString(){
        return year+"年"+month+"月"+day+"日";
    }

}
