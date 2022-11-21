package bankaccount;

public interface IbaseRate {
   default double getBaseRate(){
       return 2.5;
   }

    void showInfo();
}
