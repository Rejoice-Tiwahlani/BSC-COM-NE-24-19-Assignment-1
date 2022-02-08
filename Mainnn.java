import java.util.*;

public class Mainnn extends StudentLoans{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        StudentLoans loans = new StudentLoans();
            UnderGraduateLoan loan = new UnderGraduateLoan();
            while(true){
        System.out.println("Enter type of student \n1. Undergraduate \n2. Postgraduate \n3. Enter 0 to exit the system ");
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
        
        int rand = 100+ (int)((Math.random())*899);
        
        String random = "UG"+ rand;
        System.out.println("Your account number is : "+ random );
        UnderGraduateLoan st1 = new UnderGraduateLoan(name, program, currentyear, department, regNumber );
        System.out.println("Enter tution amount  ");
        
         loans.setTutionAmount(input.nextDouble());
            System.out.println("Enter Subsistence  " +loans.getTutionFee());
          
         System.out.println("Enter Subsistence");
         loan.setSubsitenceAmount(input.nextDouble());
         System.out.println("Enter Subsistence " +loan.getSubsistence());
          

         System.out.println("Enter Stationary amount");
         loan.setStationaryAmount(input.nextDouble());
    
        
        }
        else if(option ==2) {
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

        int rand = 100+ (int)((Math.random())*899);
        
        String random = "PG"+ rand;
        System.out.println("You account number is : "+ random );
        PostGraduateLoan st2 = new PostGraduateLoan(name, program, currentyear, nameOfThesis, Supervisor, research);
   
        }
        else{
            System.exit(0);
        }


            }
    }
}