public class PostGraduateLoan extends StudentLoans{
    private String nameOfThesis;
    private String supervisor;
    private String research;
    private double grant;
    private double totalLoanAmount;


// default constructor
public PostGraduateLoan() {

}
// a constructor with arguments. including the values from the parent class which is StudentLoans in this scenario
 PostGraduateLoan(String name,String program,String year,String nameOfThesis, String supervisor, String research){
   this.nameOfThesis = nameOfThesis;
   this.supervisor = supervisor;
   this.research = research;
 }
  
  //the setter methods
  public void setNameOfThesis(String nameOfThesis){
     this.nameOfThesis =nameOfThesis;
}

public void setSupervisor( String supervisor){
     this.supervisor =supervisor;                     //specifies the name of the supervisor
 }

 public void setResearch( String research){
     this.research =research;
 }

 public void setGrant(double grant){
     this.grant = grant;
 }

 //the getter methods
  public String getNameOfThesis(){
     return this.nameOfThesis;
 }

 public String getSupervisor(){
     return this.supervisor;
 }

 public String getResearch(){
     return this.research;
 }

 public double getGrant(){
     return this.grant;
 }
 

}