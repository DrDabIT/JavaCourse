public class CarMain {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2020, "Red");
        Car dodge = new Car("Dodge", 11000, 2019, "Black");

        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");


        nissan.setPrice(nissan.getPrice()/2);


        dodge.setPrice(dodge.getPrice()/2);

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was made in "
        + nissan.getYear() + " and is " + nissan.getColor());

        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was made in "
         + dodge.getYear() + " and is " + dodge.getColor());


    }

    

}
