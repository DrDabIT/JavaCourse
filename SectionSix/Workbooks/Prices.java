public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] values = new double[3][5];

        // Task 2 - Populate your 2D array with values from the table (see article)
        //Row one
        values[0][0] = 12.99;
        values[0][1] = 8.99;
        values[0][2] = 9.99;
        values[0][3] = 10.49;
        values[0][4] = 11.99;

        //row two
        values[1][0] = 0.99;
        values[1][1] = 1.99;
        values[1][2] = 2.49;
        values[1][3] = 1.49;
        values[1][4] = 2.99;

        //row three
        values[2][0] = 8.99;
        values[2][1] = 7.99;
        values[2][2] = 9.49;
        values[2][3] = 9.99;
        values[2][4] = 10.99;

        // Task 3 - Print the prices for each department. See the article for the expected output.  

        System.out.println("\tBaking: " + values[0][0] + " " + values[0][1] + " " + values[0][2] + " "+ values[0][3] + " " + values[0][4]);
        System.out.println("\tBeverage: " + values[1][0] + " " + values[1][1] + " " + values[1][2] + " "+ values[1][3] + " " + values[1][4]);
        System.out.println("\tCereals: " + values[2][0] + " " + values[2][1] + " " + values[2][2] + " "+ values[2][3] + " " + values[2][4]);

    }
}