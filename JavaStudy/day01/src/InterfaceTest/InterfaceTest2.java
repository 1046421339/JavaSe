package InterfaceTest;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class InterfaceTest2 {
    public static void main(String[] args) {
        Computer computer=new Computer();
        //非匿名实现类的匿名对象
        computer.transferData(new Flash());
        //匿名实现类的非匿名对象
        USB phone=new USB() {
            @Override
            public void start() {
                System.out.println("手机开始运行了");
            }

            @Override
            public void stop() {
                System.out.println("手机停止运行了");
            }
        };
        computer.transferData(phone);

        //匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始运行了");

            }

            @Override
            public void stop() {
                System.out.println("MP3停止运行了");
            }
        });
    }

}

interface USB{
    void start();
    void stop();
}

class Computer{

    public void transferData(USB usb){
        usb.start();
        System.out.println("具体传输的细节");
        usb.stop();
    }
}

class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U盘启动了");
    }

    @Override
    public void stop() {
           System.out.println("U盘停止运行了");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始运行了");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止运行了");
    }
}
