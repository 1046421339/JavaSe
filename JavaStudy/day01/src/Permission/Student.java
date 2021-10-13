package Permission;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class Student extends Person {
    String major;
    int id=1002;//学号


    public Student(){

    }

    public Student(String major){
        this.major=major;
    }

    public Student(String name,int age,String major){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生：学习知识");
        eat();
        super.eat();
    }

    public void show(){
        System.out.println("name:"+name+",age ="+age);
        System.out.println(id);
        System.out.println(super.id);
    }
}
