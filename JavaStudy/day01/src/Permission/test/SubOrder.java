package Permission.test;

import Permission.Order;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class SubOrder extends Order {
    public void method(){
        orderProtected =1;
        orderPublic=2;

        methProtected();
        methodPublic();

    }
}
