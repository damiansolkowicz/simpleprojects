package org.example.emailapp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String passowrd;
    private String email;
    private String depertement;
    private int mailCapaity=500;
    private String aleternateMail;
    private int defaultPassowrdlength;
    private String companySuffix="xyc.com";

    public Email(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        this.depertement=setDepartment();
        this.passowrd=randomPassowrd(8);
        System.out.println("Your passowrd:"+ this.passowrd);
        email=firstname.toLowerCase()+lastname.toLowerCase()+"@"+depertement+ "."+companySuffix;
      }
    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for acoountig\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int depchoice=scanner.nextInt();
        if(depchoice==1){
            return "Sales";
        }else if(depchoice==2){
            return "dev";
        } else if (depchoice==3) {
            return "account";
        }else{
            return " ";
        }
    }
    private String randomPassowrd(int length){
        String passowrdSet="ABCEDFGHAIJKLMNO%$^#*#(@&#";
        char[] passowrd=new char[length];
        for(int i =0; i<length;i++){
            int random=(int)(Math.random() * passowrdSet.length());
            passowrd[i]=passowrdSet.charAt(random);
        }
        return new String(passowrd);
    }
    public void setMailBoxCapacity(int capacity){
        this.mailCapaity=capacity;
    }

    public void setAleternateMail(String aleternateMail) {
        this.aleternateMail = aleternateMail;
    }
    public void changePassowrd(String passowrd){
        this.passowrd=passowrd;
    }
    public int getMailCapaity(){
        return mailCapaity;
    }
    public String getAleternateMail(){
        return aleternateMail;
    }
    public String getPassowrd(){
        return passowrd;
    }
    public String showInfo(){
        return "Display name: " +firstname +" " + lastname + "\nCompany mail: " + email;
    }
}
