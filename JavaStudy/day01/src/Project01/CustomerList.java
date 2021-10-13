package Project01;

import Project01.Customer;

/**
 * @Author Jason
 * @Date 2021/08/30
 * @Describe:
 */
public class CustomerList {


    private Customer[] customers;

    public CustomerList(int totalCustomer) {
        customers=new Customer[totalCustomer];

    }

    private int  totals=0;

    public boolean addCustomer(Customer customer){
        if (totals>=customers.length){
            return false;
        }else {
            customers[totals++]=customer;
            return true;
        }
    }

    public boolean replaceCustomer(int index,Customer customer){
        if (index>= totals||index<0){
            return false;
        }
        customers[index]=customer;
        return true;
    }

    public boolean deleateCustomer(int index){
        if (index>= totals||index<0){
            return false;
        }
        for (int i = index; i < totals-1; i++) {
            customers[i]=customers[i+1];
        }
        customers[totals-1]=null;
        totals--;
        return true;
    }


    public Customer[] getAllCustomers(){
//        return customers;
        Customer[]show=new Customer[totals];
        for (int i = 0; i < totals; i++) {
            show[i]=customers[i];
        }
        return show;
    }

    public Customer getCustomers(int index){
        if (index>= totals||index<0){
            return null;
        }
        return customers[index];
    }

    public int getTotals(){
        return totals;
    }
}

