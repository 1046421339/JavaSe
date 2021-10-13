package AbstractTest;


import java.util.ArrayList;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class AbstractTest {
    public static void main(String[] args) {
        Manager manager=new Manager("JJ",01,1000,200);
//        manager.work();
        System.out.println("*************************");
        //创建了一个匿名子类的对象employee
        Employee employee= new Employee() {
            @Override
            public void work() {
                System.out.println("我是匿名子类work");
            }

            @Override
            public void eat() {

            }

            @Override
            public void drink() {

            }
        };
        AbstractTest.method1(employee);

        //匿名子类的匿名对象
        AbstractTest.method1(new Employee() {
            @Override
            public void work() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void drink() {

            }
        });
//        method1(new CommonEmployee());
    }

    public static void method1(Employee e){
        e.work();
        e.eat();
    }

}

abstract class Employee{
    String name;
    int id;
    double salary;

    public Employee() {

    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
    public abstract void eat();
    public abstract void drink();
}

class Manager extends Employee{

    private double bonus;


    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工：提高工作效率");
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public void getUp(){
        System.out.println("经理需要早起");
    }
}

class CommonEmployee extends Employee{

    @Override
    public void work() {
        System.out.println("员工在一线车间生产产品");
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public void sleep(){
        System.out.println("员工需要睡觉");
    }

}

