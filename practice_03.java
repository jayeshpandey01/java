// input

import java.util.Scanner;
// import are use to importing the library in java

public class practice_03 {
    public static void main(String[] args) {
        // Scanner Scanner = new Scanner(System.in);
        // System.out.println("what is your name: ");
        // String name = Scanner.nextLine();
        // System.out.println("hello " + name);
        
        // System.out.println("what is your age: ");
        // int age = Scanner.nextInt();
        // // String yourAge = age;
        // System.out.println("your age is "+ age);

        // System.out.println("what is your school name: ");
        // String schoolName = Scanner.nextLine();
        // System.out.println("your school name is "+ schoolName);
        

        Scanner Detail = new Scanner(System.in);
        System.out.println("what is your name: ");String name = Detail.nextLine();
        System.out.println("What is your school name: ");String school = Detail.nextLine();
        System.out.println("What is your age: ");int age = Detail.nextInt();

        System.out.println("hello " + name + " your are from " + school + " your age is " + age);

    }
}
