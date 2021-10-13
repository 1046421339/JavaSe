package AbstractTest;

import DuoTai.Man;

/**
 * @Author Jason
 * @Date 2021/09/15
 * @Describe:
 */
public class TemplateTest {
    public static void main(String[] args) {
         Template t=new SubTmeplate();
         t.code();
    }
}

abstract class Template{

    //计算某段代码花费的时间
    public void spendTime(){
        long start= System.currentTimeMillis();
        code();
        long end= System.currentTimeMillis();
        System.out.println(end-start);
    }

    public abstract void code();

}

class SubTmeplate extends Template{

    @Override
    public void code() {
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
