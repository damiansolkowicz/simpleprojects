package bankaccount;

public class Checking extends Account{
    int debitCardNumber;
    int getDebitCardPin;
    public Checking(String name, String sSN, double initDepsit){
        super(name,sSN,initDepsit);
        accoutNumber="2"+accoutNumber;
        setDebitCard();
    }
    public void setRate(){

    }
    private void setDebitCard(){
        debitCardNumber=(int)(Math.random()*Math.pow(10,12));
        getDebitCardPin=(int)(Math.random()*Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();

        System.out.println("Your checkin account feaures \n" +debitCardNumber + "\n" + getDebitCardPin );
    }
}
