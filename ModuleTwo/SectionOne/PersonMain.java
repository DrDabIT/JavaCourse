public class PersonMain {
  
    public static void main(String[] args) {


      Person person = new Person("Arnesh", "08/05/2009", "Indian", 6);

      System.out.println("Name: " + person.name +
      "\nDate Of Birth: " + person.dateOfBirth + 
      "\nNationality: " + person.nationality + 
      "\nSeat Number: " + person.seatNumber);
    }
  
  
}
