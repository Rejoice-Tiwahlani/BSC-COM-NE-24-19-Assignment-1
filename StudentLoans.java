public class StudentLoans{
    private String name;
    private String program;
    private String currentYear;
    private double tutionFee;
    private double subsistence;
    private double tutionAmount;
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
    public void setTutionFee(double tutionFee){
        this.tutionFee = tutionFee;
    }
    public void setSubsistence(double subsistence){
        this.subsistence = subsistence;
    }
    public void setTutionAmount(double tutionAmount){
        this.tutionAmount = tutionAmount;
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
    public double getTutionFee(){
        return tutionAmount * Math.pow((1 + 0.1), 1 ) + tutionAmount;
    }
    public double getSubsistence(){
        return subsistence;
    }
    public double getTutionAmount(){
        return tutionAmount;
    }
      @Override
     public String toString(){
        return "\nname: " + name + "\nprogram: " + program + "\ncurrentYear: " + currentYear;
    }
}