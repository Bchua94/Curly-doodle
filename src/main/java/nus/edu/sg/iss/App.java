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
        String name = con.readLine(null, args)"What is your name");

        if(name.length() > 0){
            // different ways to print the same content to console terminal
            System.out.printf("\nNice to meet you, %s",name);
            System.out.println("\nNice to meet you, "+ name);
        } else {
            System.err.println(x"You have not told me your name");
        }
    }
        integer age = 80;
        System.out.printf("\n%s os %d years old.", name, age);
        System.out.println("\nMy name is %s. Mother is %s.", name, mother_name);

        //slide 17
        String input = con.readLine("What is your hobby?");
        input.trim(); // "  swim    " --> "swim"

        if (input.equals("Swim")) {
            System.out.println("The nearest swimming pool is Clementi");
        }
            else if(input.equals("walk")){
                System.out.println
  
            }
        }






}
