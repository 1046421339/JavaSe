package BlockTest;

import DuoTai.Man;

/**
 * @Author Jason
 * @Date 2021/09/14
 * @Describe:
 */
class Root{
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        System.out.println("Root的无参数的构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String masg){
        this();
        System.out.println("Mid的带参构造器，其参数值"+masg);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        //通过Super调用父类的带参构造器
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
    }
}
