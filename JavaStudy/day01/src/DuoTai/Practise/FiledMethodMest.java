package DuoTai.Practise;

/**
 * @Author Jason
 * @Date 2021/09/07
 * @Describe:
 */
public class FiledMethodMest {
    public static void main(String[] args) {
        Sub sub=new Sub();
        System.out.println(sub.count);
        sub.display();
        Base base=sub;
        System.out.println(base==sub);
        System.out.println(base.count);
        String s1=new String("abc");
        String s2=new String("abcd");
        Object o1=new Object();
        System.out.println(s1.equals(s2));
//        base.display();
    }
}

class Base{
    int count=10;

    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count =20;
    @Override
    public void display(){
        System.out.println(this.count);
    }
}
