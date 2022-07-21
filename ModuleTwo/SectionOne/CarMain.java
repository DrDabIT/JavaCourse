public class CarMain {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2020, "Red");
        Car dodge = new Car("Dodge", 11000, 2019, "Black");

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + ". It was made in "
        + nissan.year + " and is " + nissan.color);

        System.out.println("This " + dodge.make + " is worth $" + dodge.price + ". It was made in "
        + dodge.year + " and is " + dodge.color);
    }
}
