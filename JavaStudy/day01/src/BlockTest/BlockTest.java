package BlockTest;

/**
 * @Author Jason
 * @Date 2021/09/14
 * @Describe:
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println("这是主方法中的方法");
        String name=Person.name;
        Person person = new Person();
    }
}

class Person {
     static String name;
    private int age;
    Person(){
        System.out.println("这是构造方法中的方法");
    }

    //静态代码块
    static {
        System.out.println("这是静态代码块中的方法");
    }

    //非静态代码块
    {
        System.out.println("这是非静态代码块中的方法");
    }

    public void info() {
        System.out.println("这是类中的方法");
    }

}