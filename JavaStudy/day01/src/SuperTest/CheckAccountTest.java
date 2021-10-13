package SuperTest;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class CheckAccountTest  {
    public static void main(String[] args) {
        CheckAccount checkAccount1=new CheckAccount(1122,20000,0.045,5000);
        checkAccount1.withdraw(5000);
        System.out.println("余额为"+checkAccount1.getBalance()+"可透支余额"+checkAccount1.getOverDraft());
        checkAccount1.withdraw(18000);
        System.out.println("余额为"+checkAccount1.getBalance()+"可透支余额"+checkAccount1.getOverDraft());
        checkAccount1.withdraw(3000);
        System.out.println("余额为"+checkAccount1.getBalance()+"可透支余额"+checkAccount1.getOverDraft());
    }
}
