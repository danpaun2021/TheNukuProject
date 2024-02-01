package pachetzel;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Scan {
@Test
    public void scan(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Where are you? ");
        String place = scanner.nextLine();

        System.out.println("How many km did you walk when you visited the city? ");
        double distance = scanner.nextDouble();
        System.out.println("you have walked "+distance+" just in one day? ");

        System.out.println("You have to visit Louvre museum  in " +place);
        System.out.println("The entire art is beautiful in Louvre museum, agree? ");
        boolean agreement = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("When you are coming back? ");
        String day = scanner.nextLine();


    }
}
