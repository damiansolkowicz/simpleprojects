package Studendatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String StudentID;
    private String courses;
    private String course;
    private int tuitionBallance;
    private int costOfCourse = 600;
    private static int id = 100;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName = scanner.nextLine();
        System.out.println("Enter student last name");
        this.lastName = scanner.nextLine();
        System.out.println("1 - Freshamn\n2 - Sophore\n3 - Junior\n4 - Seniior ");
        this.gradeYear = scanner.nextLine();
        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + StudentID);

    }

    private void setStudentId() {
        id++;
        this.StudentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.println("Enter course to enrol ( 0 to quit)");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("quit")) {
                courses = courses + "\n" + course;
                tuitionBallance = tuitionBallance + costOfCourse;
            }else {
                break;
            }
        }while (1!=0);
    }
    public void viewBalance(){
        System.out.println("Your balance is: "+ tuitionBallance);
    }
    public void payTuition(){
        viewBalance();
        System.out.println("Enter Your payment: ");
        Scanner scanner=new Scanner(System.in);
        int payment=scanner.nextInt();
        tuitionBallance=tuitionBallance-payment;
        System.out.println("Thank You for yout payment of:" + payment);
        viewBalance();
    }
    public String printInfo(){
        return "Name "+ firstName + " " + lastName + "\n courses Enrolled" + courses + "\nBalance " + tuitionBallance;
    }
}
