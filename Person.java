public class Person {
  
   private String firstName;
   private String lastName;

   public Person(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
   }

   public void setfirstName(String firstName) {
     this.firstName = firstName;    
   }

   public String getfirstName() {
     return this.firstName;   
   } 

   public void setlastName(String lastName) {
     this.lastName = lastName;    
   }

   public String getlastName() {
     return this.lastName;   
   }

}