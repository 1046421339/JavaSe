package Permission;


import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class OrederTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderDefault=1;
        order.orderProtected=2;
        order.orderPublic=3;

        order.methodDefault();
        order.methProtected();
        order.methodPublic();
    }

}
