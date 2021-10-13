package InterfaceTest;

/**
 * @Author Jason
 * @Date 2021/09/16
 * @Describe:
 */
public class InterfaceTest5 {
    public static void main(String[] args) {
        man man=new man();
        man.help();
    }
}

interface Filial{
    default void help(){
        System.out.println("老妈，我来救你了");
    }
}


interface Spoony{
    default void help(){
        System.out.println("媳妇别怕我来了");
    }
}

class Father{
    public void help(){
        System.out.println("先救你妈");
    }
}

class man  extends Father implements Filial,Spoony{

//    @Override
//    public void help() {
//        System.out.println("我该救谁呢");
//        Filial.super.help();
//        Spoony.super.help();
//    }
}