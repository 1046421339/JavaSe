package DuoTai.Practise02;

/**
 * @Author Jason
 * @Date 2021/09/07
 * @Describe:
 */
public class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo(){
        return "name:"+name+"\n"+"age:"+age;
    }
}

class Student extends Person{
    protected String school="pku";
    @Override
    public String getInfo(){
        return "name:"+name+"\n"+"age:"+age+"\nschool:"+school;
    }
}

class Graduate extends Student{
    public String major="IT";
    @Override
    public String getInfo(){
        return "name:"+name+"\n"+"age:"+age+"\nschool:"+school+"\nmajor:"+major;
    }
}

class InstanceTest{
    public void method(Person e){
        String info=e.getInfo();
        System.out.println(info);
//        if (e instanceof Graduate){
//            System.out.println("a graduated student");
//            System.out.println("a student");
//            System.out.println("a person");
//        }else if (e instanceof Student){
//            System.out.println("a student");
//            System.out.println("a person");
//        }else {
//            System.out.println("a person");
//        }

        if (e instanceof Person){
            System.out.println("a person");
        }
        if (e instanceof Student){
            System.out.println("a student");
        }
        if (e instanceof Graduate){
            System.out.println("a graduated student");
        }

    }

    public static void main(String[] args) {
        InstanceTest test=new InstanceTest();
        test.method(new Person());
    }
}
