import java.util.*;

public class StudentLoans{
    private String name;
    private String program;

    //the default constructor
     public StudentLoans(){

    }

    //a constructor with arguments
    public StudentLoans(String name, String program){
         this.name = name;
        this.program = program;
}
// the setter methods 
public void setName(String newName){
    this.name = newName;
}

 public void setProgram(String program){
        this.program = program;                                 
    }

    //the getter methods
    public String getName(){
        return name;                                             
    }
    public String getProgram(){
        return program;
    }


}