/**
creating undergraduateloan class that 
extends studentloans
 */
public class UnderGraduateLoan extends StudentLoans{
     private String name;
     private String department;
    private String regNumber;
    private double stationaryAllowance;
    private double interestRate;
    private double subsistenceAmount;
    private double stationaryAmount;
    private double totalLoanAmount;

    private double subsistenceAmountInterestRate = (11.0 / 100);
    private double stationaryAmountInterestRate = (15.0 / 100);
    private double tutionAmountInterestRate = (10.0 / 100);
    
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

  public void setSubsitenceAmount ( double subsistenceAmount){
    this.subsistenceAmount = subsistenceAmount;
  }

   public void setStationaryAmount(double stationaryAmount){
     this.stationaryAmount = stationaryAmount;
   }

   public void setStationaryAllowance (double stationaryAllowance){
     this.stationaryAllowance = stationaryAllowance;
   }

//the getter methods
    public String getRegNumber(){
        return this.regNumber;
    } 

  public String getDepartment(){
        return this.department;
    }

    public double getSubsistenceAmount(){
      return subsistenceAmount;
    }

    public double setStationaryAmount(){
      return stationaryAmount;
    }

    public double getStationaryAllowance(){
      return stationaryAmount * Math.pow((1 + 0.1), 1 ) + stationaryAmount;
    }

    public double getTotalLoanAmount(){
      return (stationaryAmountInterestRate * stationaryAmount) +  (subsistenceAmountInterestRate * subsistenceAmount) + (tutionAmount * tutionAmountInterestRate); 
      }

    //overriding method called getsubsistence
      @Override
     public double getSubsistence(){
        return subsistenceAmount * Math.pow((1 + 0.1), 1 ) + subsistenceAmount;
    }

    //overriding method called toString
    @Override 
    public String toString(){
      return super.toString() + "\ndepartment :" + department + "\nregNumber :" + regNumber ; 
    }
}