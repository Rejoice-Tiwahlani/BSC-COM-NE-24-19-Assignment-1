/**
importing Scanner.util.java */
import java.util.*;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

//Main method
public class Mainnn extends StudentLoans{
     static List<StudentLoans> accountArray = new ArrayList<>();

    public static void main(String [] args){
        StudentLoans obj = null;

        
        Scanner input = new Scanner(System.in);

        //creating an object called loans
        StudentLoans loans = new StudentLoans();
            UnderGraduateLoan loan = new UnderGraduateLoan();

            //loop conditioning
            while(true){

        System.out.println("Enter type of student \n1. Undergraduate \n2. Postgraduate \n3. Repay Loan \n4. View Loans \n5. Enter 0 to exit the system ");
        int option = input.nextInt();

        //checking whether the user is a postgraduate or undergraduate student
        if(option == 1){
            System.out.println("YOU ARE AN UNDERGRADUATE STUDENT");

            System.out.println(" ");

        System.out.println("-------ENTER STUDENT DETAILS-------");

        System.out.print("Enter your name(fnmame & lname): ");
        String name = input.next();

        System.out.println("Enter Your Program: ");
        String program = input.next();

        System.out.println("Enter Year: ");
        String currentyear = input.next();
         

        System.out.println("Enter Department: ");
        String department = input.next();

        System.out.println("Enter Registration Number: ");
        String regNumber = input.next();
        
        //generating a random number
        int rand = 100+ (int)((Math.random()) * 999);
        
        String random = "UG"+ rand;
        System.out.println("Your account number is : "+ random );
        UnderGraduateLoan st1 = new UnderGraduateLoan(name, program, currentyear, department, regNumber );
        System.out.println("Enter tution amount  ");
        loans.setTutionAmount(input.nextDouble());

            System.out.println("Enter Subsistence  ");
             loan.setSubsitenceAmount(input.nextDouble());
         
          

         System.out.println("Enter Stationary amount\n ");
         loan.setStationaryAmount(input.nextDouble());

         System.out.println ("\n The total loan amount is MK"  + loan.getTotalLoanAmount());
         loan.getTotalLoanAmount();
    
        
        }

        //selection statement for postgraduate students
        else if (option ==2){
            System.out.println("Welcome Postgraduate Student");

            System.out.println("  ");

        System.out.println("-------Enter Your Details-------");

        System.out.println("Enter Your Name: ");
        String name = input.next();

        System.out.println("Enter Your Program Of Study: ");
        String program = input.next();

        System.out.println("Enter Your Year Of Study: ");
        String currentyear = input.next();

        System.out.println("Enter the title of your thesis: ");
        String nameOfThesis = input.next();

        System.out.println("Enter your supervisors name:   ");
        String Supervisor = input.next();

        System.out.println("Enter your research title :   ");
        String research = input.next();

        int rand = 100 +(int)((Math.random()) * 999);
        
        String random = "PG"+ rand;
        System.out.println("You account number is : "+ random );
        PostGraduateLoan st2 = new PostGraduateLoan(name, program, currentyear, nameOfThesis, Supervisor, research);
   
        }
        else {
            System.exit(0);
        }

    }
    }
}