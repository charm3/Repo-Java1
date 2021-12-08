package Repo_Java1.Repo_Java1;

import java.util.Locale;

public class Hwk7 {
    public static void main(String[] args) {
        /*Q1 Create a method to make abbr. for a given sentence
         * Method should return
         * " Happy birthday to you dear "--> HBTYD
         * 1. What is the purpose of method - to makeAbbr
         * 2. do I need any input from user - yes, String
         * 3. should I return any value in the end of method? - yes,
         *       if yes, then what is the datatype? - (return type = String)
         *
        String origSentence = "Happy birthday to you dear";
        String[] arrOrigSentence = origSentence.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i = 0; i < arrOrigSentence.length; i++) {
            abbreviation += arrOrigSentence[i].charAt(0);
        }
            System.out.println(abbreviation);
    */

        String Abbr = makeAbbr("Happy birthday to you dear");

        System.out.println(makeAbbr("make American great Again"));
        System.out.println(Abbr);
        System.out.println(makeAbbr("outfit of the day"));
        System.out.println(makeAbbr("good morning"));
        System.out.println(makeAbbr("Happy new year"));
        System.out.println(makeAbbr("happy new year To you dear"));
        System.out.println(makeAbbr("Happy birthday to you"));

        String Headline = convertToCap( "HappY nEW YEAR to YoU dEAr");
        System.out.println(Headline);
        System.out.println(convertToCap("gooD morNING"));
        System.out.println(convertToCap("make AMERICA GreAT AgAin"));
    }

    public static String makeAbbr(String abbrSentence) {
        String origSentence = abbrSentence;
        String[] arrOrigSentence = origSentence.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i = 0; i < arrOrigSentence.length; i++) {
            abbreviation += arrOrigSentence[i].charAt(0);

        }
        return abbreviation;
    }

    /* Q2
     * Create a method that will change the given sentence in Title case
     * Method should return
     *   HappY nEW YEAR to YoU dEAr -> Happy New Year to You Dear
     *   gooD morNING -> Good Morning
     *   make AMERICA GreAT AgAIn - Make America Great Again
     *
     *  */



    public static String convertToCap(String titleCase) {
        String oldSentence = titleCase;
        String[] arrOldSentence = oldSentence.toLowerCase().split(" ");
        String newSentence = " ";
        for (int i = 0; i <= arrOldSentence.length - 1; i++) {
            newSentence += arrOldSentence[i].substring(0, 1).toUpperCase() + arrOldSentence[i].substring(1) + " ";

        }
        return newSentence;


    }
}

/*
        * Q3:
        * Create a method to reverse a String (word by word)
        * Method should return
        *
        * Learn -> Learn
        * Learn More -> More Learn
        * happy birthday to you -> you to birthday happy
        *
        */

/**
 * Q4:
 * Create method to find the maximum value from given int-array
 * Method should return
 *
 * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
 *
 * int[] = {23, 54, 76, 12}     ->  76
 *
 * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
 */

/**
 * Q5:
 * Create a method to find if the given string is palindrome
 * Method should return (boolean)
 *
 * "level" -> true
 * "eye" -> true
 * "fall" -> false
 * "Level" ->
 */

/**
 * Q6:
 * Create a method to find the average of given int-array
 * Method should return (double)
 *
 */

/**
 * Q7:
 * Create a method to find the longest String in the given String-array
 * Method should return (String)
 *
 * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
 */



