package nus.edu.sg.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console con = System.console();
        String name = con.readLine("What is your name");

        if(name.length() > 0){
            // different ways to print the same content to console terminal
            System.out.printf("\nNice to meet you, %s",name);
            System.out.println("\nNice to meet you, "+ name);
        } else {
            System.err.println("You have not told me your name");
        }

        String mother_name = "Mary";
        Integer age = 80;
        System.out.printf("\n%s is %d years old.", name, age);
        System.out.printf("\nMy name is %s. Mother is %s.", name, mother_name);

        //slide 17
        String input = con.readLine("What is your hobby?");
        input = input.trim(); // "  swim    " --> "swim"

        if (input.equals("Swim")) {
            System.out.println("The nearest swimming pool is Clementi");
        }
        else if(input.equals("walk")){

        }

        //slide 18
        // Switch statement
        switch(input) {
            case "swim":
                System.out.println("The nearest swimming pool is Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park");
                break;
            case "cycle":
                System.out.println("You could cycle along the PCN");
                break;
            default:
                System.out.println("Seems like you are a boring person without hobby");
                break;

        }

        // Slide 19
        Integer myAge = 0;
        String inputAge = con.readLine("what is your age? ");

        myAge = Integer.parseInt(inputAge);

        if (myAge >=0 && myAge <=2) {
            System.out.println("you are a baby");
        } else if (myAge > 2 && myAge <=4) {
            System.out.println("you are a toddler");
        } else if (myAge > 4 && myAge <=12) {
            System.out.println("you are a child");
        } else if (myAge > 12 && myAge <=19) {
            System.out.println("you are a teen");
        } else {
            System.out.println("you are an adult");
        }
  

    }



        






}
