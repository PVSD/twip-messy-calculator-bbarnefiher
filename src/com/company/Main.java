package com.company;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner stringReader = new Scanner(System.in);
        Scanner doubleReader = new Scanner(System.in);


        System.out.println("Do you want to add, subtract, multiply, or divide?");
        //user input
        String userMethod = stringReader.nextLine();


        String grammarMethod = "";
        String grammarMethodTwo = "";
        if (userMethod.equalsIgnoreCase("add")){
            grammarMethod = "sum";
            grammarMethodTwo = "addition";
        }
        else if (userMethod.equalsIgnoreCase("subtract")){
            grammarMethod = "difference";
            grammarMethodTwo = "subtraction";
        }
        else if (userMethod.equalsIgnoreCase("multiply")){
            grammarMethod = "product";
            grammarMethodTwo = "multiplication";
        }
        else if (userMethod.equalsIgnoreCase("divide")){
            grammarMethod = "divident";
            grammarMethodTwo = "division";
        }
        else {
            System.out.println("Sorry, I do not know what you mean. Please enter in your method as 'add', 'subtract', 'multiply', or 'divide'.");
            System.exit(0);
        }
        //gives proper grammar to the sout when referring to user inputs



        System.out.println("Please enter two numbers. Input your numbers on two different lines.");
        //user input
        double userNumberOne = doubleReader.nextDouble();
        double userNumberTwo = doubleReader.nextDouble();

        double computerAnswer = 0;



        String computerMethod = userMethod; //this line forces while loop to run at least once
        while ((userMethod.equalsIgnoreCase(computerMethod))){ //while loop ensures computer uses the wrong method

            double randomNum = Math.random();
            // System.out.println(randomNum);

            // System.out.println("~While check");

            if (randomNum >= 0.75) { //addition
                computerMethod = "add";
                computerAnswer = userNumberOne + userNumberTwo;
               // System.out.println("~Computer will use addition");
            }
            else if (randomNum >= 0.50) { //subtraction
                computerMethod = "subtract";
                computerAnswer = userNumberOne - userNumberTwo;
               // System.out.println("~Computer will use subtraction");
            }
            else if (randomNum >= 0.25) { //multiplication
                computerMethod = "multiply";
                computerAnswer = userNumberOne * userNumberTwo;
               // System.out.println("~Computer will use multiplication");
            }
            else { //division
                computerMethod = "divide";
                computerAnswer = userNumberOne / userNumberTwo;
               // System.out.println("~Computer will use division");
            }


        }
        //math happens here

        String computerGrammarMethod = "";

        if (computerMethod.equalsIgnoreCase("add")){
            computerGrammarMethod = "addition";

        }
        else if (computerMethod.equalsIgnoreCase("subtract")){
            computerGrammarMethod = "subtraction";

        }
        else if (computerMethod.equalsIgnoreCase("multiply")){
            computerGrammarMethod = "multiplication";

        }
        else if (computerMethod.equalsIgnoreCase("divide")){
            computerGrammarMethod = "division";

        }
        else {
            System.out.println("something bad happened");
            System.exit(0);
        }






        System.out.println("The " + grammarMethod + " of " + userNumberOne + " and " + userNumberTwo + " is " + computerAnswer + ". Are you satisfied with this answer? Answer with a yes or no.");
        //user input yes or no

        String userYesNo = stringReader.nextLine();
        if (userYesNo.equalsIgnoreCase("yes")) {
            System.out.println("I didn't use " + grammarMethodTwo + ", I instead used " + computerGrammarMethod + ". Get tricked.");
            System.exit(0);
        }
        else if (userYesNo.equalsIgnoreCase("no")){
            System.out.println("Can you identify what math class method I ran my answer through?");
            String userGuess = stringReader.nextLine();

            if (userGuess.equalsIgnoreCase(computerMethod) || userGuess.equalsIgnoreCase(computerGrammarMethod)) {
                System.out.println("Yep you guessed it right. Goodbye");
                System.exit(0);
            }
            else {
                System.out.println("That wasn't the math class method I used. Goodbye");
                System.exit(0);
            }
        }

        else {
            System.out.println("Sorry, I do not know what you mean by that. Please answer with a 'yes' or a 'no', next time.");
            System.exit(0);
        }



    }
}
