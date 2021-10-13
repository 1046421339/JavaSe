package SuperTest;

/**
 * @Author Jason
 * @Date 2021/09/05
 * @Describe:
 */
public class CheckAccount extends Account {

    private double overDraft;//可透支限额

    public CheckAccount(int id, double balance, double annuallnterestRate,double overDraft) {
        super(id, balance, annuallnterestRate);
        this.overDraft=overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance()>=amount){
            //方式一
//            setBalance(getBalance()-amount);
            //方式二
            super.withdraw(amount);
        }else if (overDraft>=amount-getBalance()){//透支额度
            overDraft-=(amount-getBalance());
            setBalance(0);
        } else {
            System.out.println("超过可透支限额");
        }
    }
}
