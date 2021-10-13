package SuperTest;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1=new Account(1122,20000,0.045);
        account1.withdraw(30000);
        System.out.println("余额为"+account1.getBalance());
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println("余额为"+account1.getBalance()+"月利率"+account1.getMonthlyInterest()*100+"%");
    }
}
