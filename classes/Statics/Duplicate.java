package Statics;

public class Duplicate {
   private String firstName;
   private String lastName;
   private static int totalmembers=0; 

   public Duplicate(String firstN,String lastN){
    firstName=firstN;
    lastName=lastN;
    totalmembers++;
    System.out.printf("Name of Members is %s %s and members in the club %d \n",firstName,lastName,totalmembers);
   }
   public String getfirstN(){
    return firstName;
   }
   public String getlastN(){
    return lastName;
   }
   public static int gettotalmembers(){
    return totalmembers;
}
}
