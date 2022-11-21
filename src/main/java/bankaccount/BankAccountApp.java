package bankaccount;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking checkacc1=new Checking("Jan Kowalski", "8584943", 1500);
        Savings savaazz1= new Savings("Michał Nowak","84894",1300);

        savaazz1.showInfo();
        checkacc1.showInfo();
    }
}
