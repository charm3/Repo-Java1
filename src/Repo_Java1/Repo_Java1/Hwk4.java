package Repo_Java1.Repo_Java1;

import java.util.Arrays;
import java.util.Locale;

public class Hwk4 {
    public static void main(String[] args) {
        /* Homework 4.
         * Q1
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (Note: you cannot use length () from String class
         * Hint: you need to use split() method and length (from Array) */

        String countryName = "People's Republic of China";
        System.out.println(countryName);
        System.out.println("the size of array of country name is " + countryName.split("").length);
        //print out result: the size of array of country name is 26.

        /* Q2:
         * Print the number of words in the sentence2-value */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";

        System.out.println("the number of words in  sentence2 is  " + sentence2.split(" ").length);
        // print out result: the number of words in sentence2 is 13.

        /*Q3:
         * Create the abbreviation for 4-word sentence
         * "make America great again --> MAGA
         * outfit of the day --> OOTD
         * happy birthday to you --> HBTY
         * */
        String sentence3 = "make America great again";
        String[] sen3Split = sentence3.toUpperCase().split(" ");
        System.out.println(Arrays.toString(sen3Split));
        //print out result: MAKE,AMERICA,GREAT,AGAIN
        // HELP! DO NOT KNOW HOW TO MAKE ABBREVIATIONS!
        String abbreviation = "";
        for (int i = 0; i < sen3Split.length; i++) {
            abbreviation += sen3Split[i].charAt(0);
        }
        System.out.println(abbreviation);

//outfit of the day --> OOTD

        String OOTD = "outfit of the day";
        String[] ootdSplit = OOTD.toUpperCase().split(" ");
        String ootdAbbr = "";
        for (int j = 0; j < ootdSplit.length; j++) {
            ootdAbbr = ootdAbbr + ootdSplit[j].charAt(0);
        }
        System.out.println(ootdAbbr);

        //happy birthday to you --> HBTYString hbty = "happy birthday to you";
        //        String[] arrHBTY =  hbty.toUpperCase().split(" ");
        //        String hbtyAbbr = "";
        //        for (int k = 0; k< arrHBTY.length; k++) {
        //            hbtyAbbr += arrHBTY[k].charAt(0);
        //        }
        //        System.out.println(hbtyAbbr);


    }
}









