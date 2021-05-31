package org.example;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String userInput;
        Integer age, retireAge, result, year;

        year = Year.now().getValue();

        System.out.println("What is your current age? ");
        userInput = input.nextLine();
        age = Integer.parseInt(userInput);

        System.out.println("At what age would you like to retire? ");
        userInput = input.nextLine();
        retireAge= Integer.parseInt(userInput);
        result = retireAge - age;
        if(result>0) {
            System.out.printf("You have %d years left until you can retire.\n", result);
            System.out.printf("It's %d, so you can retire in %d.", year, year+result);
        }
        else{
            System.out.println("You can already retire");
        }


    }
}
