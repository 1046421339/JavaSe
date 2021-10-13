package InterfaceTest;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Plan plan=new Plan();
        plan.fly();
    }
}

class Plan implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机起飞了哦");
    }

    @Override
    public void stop() {
        System.out.println("飞机降落了哦");
    }
}

class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED=7900;
    //抽象方法
    public abstract void fly();
    //省略
    void stop();
}

interface Attackable{
    void attack();
}
