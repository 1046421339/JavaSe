package InterfaceTest;

/**
 * @Author Jason
 * @Date 2021/09/17
 * @Describe:内部类
 */
public class InnerClassTest {
    public static void main(String[] args) {
        Person1.Cat cat = new Person1.Cat();
        cat.show();
        Person1 person1 = new Person1();
        Person1.Dog dog = person1.new Dog();
        dog.shot();
    }
}


class Person1 {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }

    //静态成员内部类
    static class Cat {
        String name;
        int age;

        public void show() {
            System.out.println("卡拉是条猫");
        }
    }

    //非静态成员内部类
    class Dog {
        String name;

        public Dog() {

        }

        public void shot() {
            System.out.println("我是一条大狼狗");
            eat();
        }

    }

    //构造器中的局部内部类
    public Person1() {
        class aa {

        }
    }

    //代码块中的局部内部类
    {
        class bb {

        }
    }

    //方法中的局部内部类
    public void method() {
        class cc {

        }
    }
}
