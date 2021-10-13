package Permission;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }

    void methodDefault(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }

    protected void methProtected(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }

    public void methodPublic(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
}
