package com.pluralsight;

// * Imports for needed libraries

import java.util.ArrayList;
import java.util.Scanner;

public class FamousQuotesMain {

    public static void main(String[] args) {

//        boolean appRunning = true;
//        while (appRunning) {
//            try {

        //* Creating a scanner for user input
        Scanner sc = new Scanner(System.in);

        // * Creating a List that holds String data type - titled it famousQuotes as the contents will reflect that name
        ArrayList<String> famousQuotes = new ArrayList<String>();
        famousQuotes.add("'Be the change that you wish to see in the world.' - Mahatma Gandhi");
        famousQuotes.add("'I think, therefore I am.' - René Descartes");
        famousQuotes.add("'The only thing we have to fear is fear itself.' - Franklin D. Roosevelt");
        famousQuotes.add("'To be or not to be, that is the question.' - William Shakespeare");
        famousQuotes.add("'In three words I can sum up everything I've learned about life: it goes on.' - Robert Frost");
        famousQuotes.add("'Not all those who wander are lost.' - J.R.R. Tolkien");
        famousQuotes.add("'The unexamined life is not worth living.' - Socrates");
        famousQuotes.add("'Life is what happens when you're busy making other plans.' - John Lennon");
        famousQuotes.add("'The journey of a thousand miles begins with one step.' - Lao Tzu");
        famousQuotes.add("'The greatest glory in living lies not in never falling, but in rising every time we fall.' - Nelson Mandela");

        // * Prompting the user for input in the form of an int, and storing that response in variable numberSelection
        System.out.println("Pick a number between 1 and 10 to receive a famous quote: ");
        int numberSelection = sc.nextInt();
        sc.nextLine();

        //*This is if they pick 1 it starts at 0, the actual List/ArrayList starting position
        --numberSelection;

        System.out.println("The number you selected holds this quote:\n" + famousQuotes.get(numberSelection));

//                if (numberSelection < 0) {
//                    appRunning = false;
//                }
//
//            } catch (Exception e) {
//
//                //* log the error to some reporting system or email the dev
//
//                //* print out a shorter version of the error
//                System.out.println(e.getMessage());
//
//                //*display user friendly message
//                System.out.println("The number you chose was invalid! Maybe there was a typo?");
//
//            }

    } // ! main method cBracket

} // ! main class cBracket
