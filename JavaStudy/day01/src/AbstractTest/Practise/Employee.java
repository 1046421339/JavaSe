package AbstractTest.Practise;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    abstract double earnings();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() ;
    }
}
