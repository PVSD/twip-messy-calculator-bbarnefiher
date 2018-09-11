package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner stringReader = new Scanner(System.in);
        Scanner intReader = new Scanner(System.in);


        System.out.println("Do you want to add, subtract, multiply, or divide?");
        //user input
        String userMethod = stringReader.nextLine();


        String grammarMethod = "";
        if (userMethod.equals("add")){
            grammarMethod = "sum";
        }
        else if (userMethod == subtract){
            grammarMethod = "difference";
        }
        else if (userMethod == multiply){
            grammarMethod = "product";
        }
        else if (userMethod == divide){
            grammarMethod = "divident";
        }
        else {
            System.out.println("Sorry, I do not know what you mean. Please enter in your method as 'add', 'subtract', 'multiply', or 'divide'.");
            System.exit(0);
        }




        System.out.println("Please enter two numbers. Input your numbers on two different lines.");
        //user input
        int userNumberOne = intReader.nextInt();
        int userNumberTwo = intReader.nextInt();




        System.out.println("The" + grammarMethod + " of " + userNumberOne + " and " + userNumberTwo + " is [answer]. Are you satisfied with this answer?");
        //user input yes or no



            //if answer is yes:
            System.out.println("You have been misinformed and your answer is wrong btw");
            System.exit(0);



            //if answer is no:
            System.out.println("Can you identify what math class method I ran the real answer through?");
            //user input real math class used


                //if user input is correct:
                System.out.println("Yep you did it good job. Goodbye");
                System.exit(0);

                //if user input is wrong:
                System.out.println("That wasn't the math class method I used. Goodbye");
                System.exit(0);


    }
}
