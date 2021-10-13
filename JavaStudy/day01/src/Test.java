/**
 * @Author Jason
 * @Date 2021/09/17
 * @Describe:
 */
public class Test {
    public static void main(String[] args) {
        A a=new A(); a.test1();
        A a1=new B();a1.test1();
        B b=new B();b.test1();
        sleep();
    }

    public static void sleep(){
        System.out.println("我要睡觉了");
    }
}

class A{
    String name;

    public static void test1(){
        System.out.println("A TEST");
    }
}

class B extends A{
    public static void test1(){
            System.out.println("B TEST");
    }
}

class C extends A{
    public static void test2(){
        System.out.println("C TEST");
    }
}
