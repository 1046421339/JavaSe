package InterfaceTest;

/**
 * @Author Jason
 * @Date 2021/09/16
 * @Describe:
 */
public class IntefaceTest3 {

    public static void main(String[] args) {
        CompareableCircle c1=new CompareableCircle(11.1);
        CompareableCircle c2=new CompareableCircle(12.0);

        int compareValue=c1.compareTo(new String("aa"));
        if (compareValue>0){
            System.out.println("c1对象大");
        }else if (compareValue<0){
            System.out.println("c2对象大");
        }else {
            System.out.println("一样大");
        }
    }
}

interface CompareObject{
    //若返回值是0，则代表相等；若为正数，代表当前对象大；负数代表当前对象小
    public abstract int compareTo(Object o);
}

class Circle{
    Double redius;

    public Circle() {
    }

    public Circle(Double redius) {
        this.redius = redius;
    }

    public Double getRedius() {
        return redius;
    }

    public void setRedius(Double redius) {
        this.redius = redius;
    }
}

class CompareableCircle extends Circle implements CompareObject{

    public CompareableCircle(Double redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        if (this==o){
            return 0;
        }
        if (o instanceof CompareableCircle){
            CompareableCircle c=(CompareableCircle)o;
            return this.getRedius().compareTo(c.getRedius());
        }else {
//            return 65535;
            throw new RuntimeException("闯入的数据不匹配");
        }
    }
}
