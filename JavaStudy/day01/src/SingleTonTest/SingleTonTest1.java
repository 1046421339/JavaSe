package SingleTonTest;

/**
 * @Author Jason
 * @Date 2021/09/13
 * @Describe:
 */

//单例模式   懒汉式
public class SingleTonTest1 {
    public static void main(String[] args) {

    }

}

class Bank{
    private Bank(){

    }

    private static Bank instance=null;

    public static  Bank getInstance(){
        instance=new Bank();
        return instance;
    }
}
