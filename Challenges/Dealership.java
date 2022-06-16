import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Dealership {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");
        System.out.println("- type 'a' to buy a car");
        System.out.println("- type 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a": 
            System.out.println("What is your budget? (no symbols just numbers!)");
            int budget = scan.nextInt();
            if (budget >= 10000){
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("\nDo you have insurance? (yes or no)");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have a drivers license? (yes or no)");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score");
                int creditScore = scan.nextInt();

                if (insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                    System.out.println("Sold! Pleasure doing business with you!");
                }
                else {
                    System.out.println("We're sorry! You're not eligible.");
                }
            }
            else {
                System.out.println("We do not sell cars under $10000! Sorry!");
            }
            break;
            case "b": System.out.println("You chose option " + option); break;
            default: System.out.println("Invalid Option");
        }
        scan.close();

    }
}
