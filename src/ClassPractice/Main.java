package ClassPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name1; int roll1;
        Scanner sc =new Scanner(System.in);
        name1 = sc.next();
        roll1 = sc.nextInt();
        Student obj = new Student(name1,roll1);
        Teacher ob = new Teacher("01745534677","Saikat","CSE");
        School obb = new School("BIAM","Bogura","01755111413",12,42,33);
        System.out.println("Student Information is : ");
        System.out.println(obj.name);
        System.out.println(obj.roll);
        System.out.println("Teacher Information is : ");
        System.out.println("Teacher mobile number : "+ ob.mobilenum);
        System.out.println("Teacher's name "+ ob.name);
        System.out.println("Teacher's Subject name : "+ ob.sub);
        System.out.println("School Information: ");
        System.out.println("The School name is : "+ obb.name);
        System.out.println("Location is : "+obb.location);
        System.out.println("Principle phone number is : "+ obb.mobileNumber);
        System.out.println("Here Class level is : "+ obb.cls);
        System.out.println("Here rooom number is : "+ obb.roomNo);

        System.out.println("Student Information is given: ");
        System.out.println("Enter the Student name : ");



    }
}
