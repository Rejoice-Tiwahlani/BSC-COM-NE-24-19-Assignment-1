public class StudentLoans{
    private String name;
    private String program;
    private String currentYear;

    //the default constructor
     public StudentLoans(){

    }

    //a constructor with arguments
    public StudentLoans(String name, String program, String currentYear){
         this.name = name;
        this.program = program;
        this.currentYear = currentYear;
}
// the setter methods 
public void setName(String newName){
    this.name = newName;
}

 public void setProgram(String program){
        this.program = program;                                 
    }

     public void setcurrentYear(String newcurrentYear){
        this.currentYear = newcurrentYear;
    }

    //the getter methods
    public String getName(){
        return this.name;                                             
    }

    public String getProgram(){
        return this.program;
    }

      public String getcurrentYear(){
        return this.currentYear;
    }
      @Override
     public String toString(){
        return "\nname: " + name + "\nprogram: " + program + "\ncurrentYear: " + currentYear;
    }
}