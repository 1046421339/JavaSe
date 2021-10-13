package Object;

import org.junit.Test;

/**
 * @Author Jason
 * @Date 2021/09/08
 * @Describe:
 */
public class JUnit {
    @Test
    public void test1() {
        Integer integer = new Integer("123");
        System.out.println(integer.toString());
        Boolean b1 = new Boolean("true");
        System.out.println(String.valueOf(b1));
        String s2=String.valueOf(integer);
        System.out.println(s2);
        String s1 = "111";
        System.out.println(Integer.parseInt(s1));
        System.out.println(b1.toString());

        System.out.println(s1.toString());
    }

    @Test
    public void test2() {
        Integer integer = new Integer(21);
        int a = integer.intValue();
        System.out.println(a + 5);
    }

    @Test
    public void test3() {
        int num1 = 19;
        method(new Integer(num1));
    }

    public void method(Object obj) {
        System.out.println("自动装包");
    }
}
