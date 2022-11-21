package bankaccount;

import java.util.SortedMap;

public class Savings extends Account{
    double safetyDepositeBoxId;
    int getSafetyDepositeBoxKey;

    public Savings (String name, String sSN, double initDepsit){
        super(name,sSN,initDepsit);

        accoutNumber="1" + accoutNumber;
        setSafetydepositBox();
    }

    private   void setSafetydepositBox(){
        safetyDepositeBoxId=(int) (Math.random()*Math.pow(10,3));
        getSafetyDepositeBoxKey=(int) (Math.random()*Math.pow(10,4));
    }
    public void  showInfo(){
        System.out.println("Account type:  Savings");
        super.showInfo();
        System.out.println("Your Savings account features\n Safety deposit box id is " + safetyDepositeBoxId+
        "\n Safety deposit box Key " + getSafetyDepositeBoxKey);
    }
}
