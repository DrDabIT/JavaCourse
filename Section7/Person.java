public class Person {
    private String name;
    private String dateOfBirth;
    private String nationality;
    //private String[] passport;
    private int seatNumber;

    public Person (String name, String dateOfBirth, String nationality, int seatNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.seatNumber = seatNumber;
    }

    public String getName(){
        return name;
    }

    public String getdateOfBirth(){
        return dateOfBirth;
    }

    public String getNationality(){
        return nationality;
    }

    public int getseatNumber(){
        return seatNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setdateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setseatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
}
