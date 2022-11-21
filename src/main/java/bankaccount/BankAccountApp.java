package bankaccount;

import java.util.List;

public class BankAccountApp {
    static String file="/home/damian/Java/simpleprojects/src/main/java/bankaccount/NewBankAccounts.csv";
    public static void main(String[] args) {
      /*  Checking checkacc1=new Checking("Jan Kowalski", "8584943", 1500);
        Savings savaazz1= new Savings("Michał Nowak","84894",1300);

        savaazz1.showInfo();
        checkacc1.showInfo();
        savaazz1.deposit(500);
        savaazz1.withdra(300);
        savaazz1.transfer("Jan",200);*/

        List<String[]>newCustomers= CSV.read(file);
        for(String[]customer:newCustomers){
            System.out.println("New account");
            System.out.println(customer[0]);
            System.out.println(customer[1]);
            System.out.println(customer[2]);
            System.out.println(customer[3]);
        }

    }
}
