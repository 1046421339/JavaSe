package JiCheng;

/**
 * @Author Jason
 * @Date 2021/09/03
 * @Describe:
 */
public class Kids extends ManKIND {
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(yearsOld);
    }
}
