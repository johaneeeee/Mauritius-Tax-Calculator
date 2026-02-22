/*

             Date:27/07/2023
             Name: Johane
             Purpose:program to calculate tax in Mauritius
             Modification: none.

*/

import java.util.Scanner;
      public class TaxCalculator{

             public static void main(String [] args){

Scanner input =new Scanner (System.in);

// information about the user

     System.out.print("Enter Surname : ");
     String Surname =input.nextLine(); 

                System.out.print("Enter Other Name(s): ");
                String Othername = input.nextLine(); 

        System.out.print("Enter Marital Status : ");
        String MaritalStatus= input.nextLine(); 

                 System.out.print("Enter yearly salary : Rs");
                 double YearlySalary = input.nextDouble(); 

          System.out.print("Enter other incomes from other employers: Rs ");
          double OtherIncomes= input.nextDouble(); 

                          System.out.print("Enter bonus : Rs ");
                          double bonus= input.nextDouble(); 

           System.out.print("Enter Total Tax withheld under PAYE:Rs ");
           double TotalTax= input.nextDouble(); 


                           System.out.print("Tax Category (A,B,C,D or E): ");
                            char Category = input.next().toUpperCase().charAt(0);

           System.out.print("interest paid on the secured loan (yearly) of any(Max Rs 120,000) : Rs ");
             double SecuredLoan = input.nextDouble(); 

//variables of medical reliefs 

              double selfMedicalRelief=0;
              double WithOneDependent=0;
              double With2Dependent=0;
              double With3Dependent=0;

if(Category=='A'||Category=='E'){
 System.out.println("self medical relief :");
       selfMedicalRelief= input.nextDouble();

}else 
if(Category=='B'||Category=='F'){

     System.out.println("self medical relief :");
      selfMedicalRelief= input.nextDouble(); 

             System.out.println("medical relief first dependent :");
                 WithOneDependent= input.nextDouble();

}else 
if(Category=='C'){

    System.out.println("self medical relief :");
      selfMedicalRelief= input.nextDouble(); 

            System.out.println("medical relief first dependent :");
                WithOneDependent= input.nextDouble();

    System.out.println("medical relief second dependent :");
       With2Dependent= input.nextDouble();


}else 
if(Category=='D'){

System.out.println("self medical relief :");
  selfMedicalRelief= input.nextDouble(); 

       System.out.println("medical relief first dependent :");
         WithOneDependent= input.nextDouble();

              System.out.println("medical relief second dependent :");
                With2Dependent= input.nextDouble();

                      System.out.println("medical relief 3rd dependent :");
                        With3Dependent= input.nextDouble();

}

//formulas
        double TotalIncome= YearlySalary + OtherIncomes + bonus ;

        double TotalMedicalReliefs = selfMedicalRelief + WithOneDependent + With2Dependent + With3Dependent;

        double TotalDeductions =  TotalMedicalReliefs + SecuredLoan;

        double chargeableIncome = TotalIncome - TotalDeductions;
        

//declaration of TaxPayable variables

 double TaxPayable= 0;

if(chargeableIncome>0 && chargeableIncome<=390000){
TaxPayable= 0;

}else 
if(chargeableIncome>390001 && chargeableIncome<=430000){
TaxPayable= (chargeableIncome-390000)*0.02;

}else 
if(chargeableIncome>430001 && chargeableIncome<=470000){
TaxPayable= (chargeableIncome-430000)*0.04;


}else 
if(chargeableIncome>470001 && chargeableIncome<=530000){
TaxPayable= (chargeableIncome-470000)*0.06;


}else 
if(chargeableIncome>530001 && chargeableIncome<=590000){
TaxPayable= (chargeableIncome-530000)*0.08;

}else 
if(chargeableIncome>590001 && chargeableIncome<=890000){
TaxPayable= (chargeableIncome-590000)*0.10;

}else 
if(chargeableIncome>890001 && chargeableIncome<=1190000){
TaxPayable= (chargeableIncome-890000)*0.12;


}else 
if(chargeableIncome>1190001 && chargeableIncome<=1490000){
TaxPayable= (chargeableIncome-1190000)*0.14;


}else 
if(chargeableIncome>1490001 && chargeableIncome<=1890000){
TaxPayable= (chargeableIncome-1490000)*0.16;


}else 
if(chargeableIncome>1890001 && chargeableIncome<=2390000){
TaxPayable= (chargeableIncome-1890000)*0.18;


}else 
if(chargeableIncome>2390000 ){
TaxPayable= (chargeableIncome-2390000)*0.20;


}

//output

System.out.println("---------------------------------------------------------------------------------------");
System.out.println("           ");
System.out.println("Surname : " +Surname+ " Other Name(s): "+Othername+ " Marital Status: "+MaritalStatus);

System.out.println("---------------------------------------------------------------------------------------");
System.out.println(           );
System.out.println("Tax Category (A,B,C,D or E): " +Category + "  Amount :Rs"+chargeableIncome);
System.out.println("Interest On Secured Loan : Rs"+SecuredLoan+ "  Medical Reliefs : Rs"+ TotalMedicalReliefs );

System.out.println("---------------------------------------------------------------------------------------");
System.out.println("     ");
System.out.println("- Total income : Rs "+ TotalIncome +"  Total Deduction : Rs"+ TotalDeductions );


System.out.println("---------------------------------------------------------------------------------------");
System.out.println("     ");
System.out.println("- Chargeable Income : Rs"+ chargeableIncome );

System.out.println("---------------------------------------------------------------------------------------");
System.out.println("     ");
System.out.println("- Tax withheld under PAYE : Rs"+ TotalTax + "  Tax Payable : Rs " +TaxPayable );

System.out.println("---------------------------------------------------------------------------------------");
System.out.println("     ");
System.out.println("- Tax Paid in Excess :xxxxxxx" );




}
}