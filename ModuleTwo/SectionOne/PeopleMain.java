import java.util.Arrays;

public class PeopleMain {
  
    public static void main(String[] args) {


      People person = new People();

      person.name = "Arnesh";
      person.nationality = "Indian";
      person.dateOfBirth = "08/05/2009";
      person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
      person.seatNumber = 6; 
    
      System.out.println(person.name);
      System.out.println(person.nationality);
      System.out.println(person.dateOfBirth);
      System.out.println(Arrays.toString(person.passport));
      System.out.println(person.seatNumber);
      
    }
  
  
}
