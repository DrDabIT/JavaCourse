import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?\n");
        String lines = scan.nextLine();

        for (int i = 1; i <= 100; i++) {
            System.out.println("\n" + i + ". " + lines + "\n");
        }
        





        scan.close();
    }
}
