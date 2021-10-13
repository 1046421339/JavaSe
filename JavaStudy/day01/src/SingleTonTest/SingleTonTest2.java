package SingleTonTest;

/**
 * @Author Jason
 * @Date 2021/09/13
 * @Describe:
 */

//单例模式   饿汉式
public class SingleTonTest2 {
    public static void main(String[] args) {

    }
}
class Customer{
    private Customer(){

    }

    private static Customer instance=new Customer();

    public static Customer getInstance(){
        return instance;
    }
}
