package Object;

/**
 * @Author Jason
 * @Date 2021/09/08
 * @Describe:
 */
public class Test {
    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        Circle circle2=new Circle(5);
        Boolean isResult=circle1.equals(circle2);
        System.out.println(circle1==circle2);
        System.out.println(isResult);
        System.out.println(circle1.toString());
        System.out.println("***********************");
        Integer integer=new Integer(100);
        System.out.println(integer);
        Integer integerr=new Integer(100);
        System.out.println(integer==integerr);
        Integer integer1=1;
        Integer integer2=1;
        System.out.println(integer1==integer2);
        Integer integer3=127;
        Integer integer4=127;
        System.out.println(integer3==integer4);
        System.out.println(0x7fffffff);

    }


}
