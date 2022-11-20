package org.example.emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Jhon", "SMith");
        Email em2=new Email("Michał", "Nowak");
 /*       em1.setAleternateMail("jan@jan.pl");
        System.out.println(em1.getAleternateMail());*/
        System.out.println(em1.showInfo());
        System.out.println(em2.showInfo());
    }

}
