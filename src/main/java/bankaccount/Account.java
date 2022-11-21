package bankaccount;

public class Account implements IbaseRate{
    String name;
    String sSN;
    double balance;
    String accoutNumber;
    double rate;
    static int index=10000;
    public Account(String name, String sSN, double intDeposit){
        this.name=name;
        this.sSN=sSN;
        this.accoutNumber=setAccountNumber();
        balance=intDeposit+100;
        index++;
        System.out.println(getBaseRate());
    }


    private  String setAccountNumber(){
        String lasTwoSSN=sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID=index;
        int randomnumber= (int) (Math.random()*Math.pow(10,3));
        return lasTwoSSN+uniqueID+randomnumber;
    }

    @Override
    public void showInfo() {
        System.out.println("Account{" +
                "name='" + name + '\'' +
           //     ", sSN='" + sSN + '\'' +
                ", balance=" + balance +
                ", accoutNumber='" + accoutNumber + '\'' +
               // ", rate=" + rate +
                '}');
    }
}
