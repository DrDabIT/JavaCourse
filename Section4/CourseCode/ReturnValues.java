import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        


        System.out.println("What is your length: ");
        double length = scan.nextDouble();

        System.out.println("What is your width: ");
        double width = scan.nextDouble();

        double measure = measureRectangle(length, width);

        System.out.println("The area is " + measure);

        scan.close();
    }

    public static double measureRectangle(double length, double width){
        double area = length * width;
        return area;
    }

}