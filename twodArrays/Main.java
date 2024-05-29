package twodArrays;

public class Main {
    public static void main(String[] args) {

        // 2D Array = an array of arrays

        // 2d array you need to define the number of rows and columns that will be used
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro"; // this access our point 0 0 on the array
        cars[0][1] = "Corvette"; // This access our point 0 1 on the array
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[3][2] = "Tesla";

        // our columns
        for (int i = 0; i < cars.length; i++) {
            // create our row
            System.out.println();
            // row length
            for (int j = 0; j < cars[i].length; j++) {
                // display out cars in the row and keep going till we are done with the length
                // of the row
                System.out.println(cars[i][j]);
            }
        }

        // if we wanted to assign the values before allocating space then we could of
        // done this instead

        String[][] car = {
                { "Camaro", "Corvette", "Silverado" },
                { "Mustang", "Ranger", "F-150" },
                { "Ferrari", "Lambo", "Tesla" }
        };

    }
}
