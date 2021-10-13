package DuoTai;

/**
 * @Author Jason
 * @Date 2021/09/06
 * @Describe:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.eat();
        System.out.println("*************************");
        Person p2=new Man();
        p2.eat();
        p2.walk();
        p2.wuhu();
    }
}
