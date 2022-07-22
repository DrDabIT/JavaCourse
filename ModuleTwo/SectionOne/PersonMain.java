public class PersonMain {
  
    public static void main(String[] args) {


      Person person = new Person("Arnesh", "08/05/2009", "Indian", 6);
      
      person.setseatNumber(10);

      System.out.println("Name: " + person.getName() +
      "\nDate Of Birth: " + person.getdateOfBirth() + 
      "\nNationality: " + person.getNationality() + 
      "\nSeat Number: " + person.getseatNumber());
    }
  
  
}
