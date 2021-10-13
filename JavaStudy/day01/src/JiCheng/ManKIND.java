package JiCheng;

/**
 * @Author Jason
 * @Date 2021/09/03
 * @Describe:
 */
public class ManKIND {
    private int sex;
    private int salary;


    public ManKIND() {
    }

    public ManKIND(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex==1){
            System.out.println("man");
        }else {
            System.out.println("woman");
        }
    }
    public void emPloyeed(){
        if (salary==0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }



}
