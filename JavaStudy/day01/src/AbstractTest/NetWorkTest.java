package AbstractTest;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:接口的应用：代理模式
 */
public class NetWorkTest {
    public static void main(String[] args) {
        ProxyServer proxyServer=new ProxyServer(new Server());
        proxyServer.browse();
    }
    
}

interface NewWork{
    public abstract void browse();
}


//被代理类
class Server implements NewWork{
    @Override
    public void browse() {
        System.out.println("链接网络");
    }
}

//代理类
class ProxyServer implements NewWork{

    private NewWork newWork;

    public ProxyServer(NewWork newWork) {
        this.newWork = newWork;
    }

    public void check(){
        System.out.println("检查网络链接");
    }

    @Override
    public void browse() {
        check();
        newWork.browse();
    }
}
