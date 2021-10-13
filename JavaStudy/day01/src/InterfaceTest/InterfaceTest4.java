package InterfaceTest;

/**
 * @Author Jason
 * @Date 2021/09/16
 * @Describe:
 */
public class InterfaceTest4 {

}

class SubClassTest{
    public static void main(String[] args) {
        Subclass subclass=new Subclass();
        subclass.method2();
        CompareA.method1();
        subclass.MyMethod();
    }
}

class Subclass implements CompareA{
    public void method2(){
        System.out.println("Subclass:Jason");
    }

    public void MyMethod(){
        CompareA.super.method2();
    }

}

interface CompareA{
    public static void method1(){
        System.out.println("Compare:李俊杰");
    }

    public default void method2(){
        System.out.println("Compare:Jason");
    }
}
