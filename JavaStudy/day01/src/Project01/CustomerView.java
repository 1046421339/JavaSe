package Project01;

import java.util.Scanner;

/**
 * @Author Jason
 * @Date 2021/08/30
 * @Describe:
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {

    }

    //显示客户界面
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("------------------------客户管理系统--------------------------------");
            System.out.println("                       1.添加客户");
            System.out.println("                       2.修改客户");
            System.out.println("                       3.删除客户");
            System.out.println("                       4.客户列表");
            System.out.println("                       5.退    出");
            System.out.print("请选择1-5:");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addMainMenu();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                default:
            }
        }
    }

    //添加客户
    public void addMainMenu() {
        System.out.println("------------------------客户管理系统--------------------------------");
        System.out.print("姓名");
        String name = CMUtility.readString(10);
        System.out.print("性别");
        char gendar = CMUtility.readChar();
        System.out.print("年龄");
        int age = CMUtility.readInt();
        System.out.print("电话");
        String phone = CMUtility.readString(12);
        System.out.print("邮箱");
        String email = CMUtility.readString(20);

        //将数据封装到数组中
        Customer customer = new Customer(name, gendar, age, phone, email);
        Boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //修改客户的操作
    public void modifyCustomer() {
        System.out.println("------------------------修改客户--------------------------------");
        System.out.print("请输入待修改的客户编号（-1退出）");
        int index = CMUtility.readInt();
        Customer customer;
        for (; ; ) {
            if (index == -1) {
                return;
            }
            customer = customerList.getCustomers(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        System.out.println("姓名(" + customer.getName() + ")");
        String changeName = CMUtility.readString(10, customer.getName());
        customer.setName(changeName);
        System.out.println("性别(" + customer.getGender() + ")");
        char changeGendar = CMUtility.readChar();
        customer.setGender(changeGendar);
        System.out.println("年龄(" + customer.getAge() + ")");
        int changeAge = CMUtility.readInt();
        customer.setAge(changeAge);
        System.out.println("手机(" + customer.getPhone() + ")");
        String changePhone = CMUtility.readString(12, customer.getPhone());
        customer.setPhone(changePhone);
        System.out.println("邮箱(" + customer.getEmail() + ")");
        String changeEmail = CMUtility.readString(20, customer.getEmail());
        customer.setEmail(changeEmail);
    }


    //删除客户的操作
    public void deleteCustomer() {
        System.out.println("------------------------删除客户--------------------------------");
        int index;
        Customer customer;
        for (; ; ) {
            System.out.println("请输入用户编号(-1退出)");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            customer = customerList.getCustomers(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定用户");
            } else {
                break;
            }
        }
        customerList.deleateCustomer(index - 1);
    }


    //显示客户列表的操作
    public void listAllCustomers() {
//        System.out.println("显示客户列表");
        System.out.println("------------------显示客户列表------------------");
        int total = customerList.getTotals();
        if (total == 0) {
            System.out.println("没有指定用户");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for (int j = 0; j < customers.length; j++) {
                System.out.println((j + 1) + "\t" + "\t" + customers[j].getName() + "\t" +
                        +customers[j].getGender() + "\t"
                        + customers[j].getAge() + "\t"
                        + customers[j].getPhone() + "\t"
                        + customers[j].getEmail());
            }
            System.out.println("------------------客户列表完成------------------");
        }
    }


    //
    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
