public class UnderGraduateLoan extends StudentLoans{
     private String department;
    private String regNumber;
    
    //the default no arg constructor
    UnderGraduateLoan (){

    }
    //construcor with arguments
    UnderGraduateLoan (String name,String program,String year, String department, String regNumber){
        this.department = department;
        this. regNumber = regNumber;
    }
    //the setter methods
   public void setDepartment ( String department){
        this.department = department;
    }
    public void setRegNumber( String regNumber){
    this.regNumber = regNumber;
  }

//the getter methods
    public String getRegNumber(){
        return this.regNumber;
    } 
  public String getDepartment(){
        return this.department;
    }
    @Override 
    public String toString(){
      return super.toString() + "\ndepartment :" + department + "\nregNumber :" + regNumber ; 
    }
}