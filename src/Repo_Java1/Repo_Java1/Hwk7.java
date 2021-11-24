package Repo_Java1.Repo_Java1;

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

       String Abbr = makeAbbr ("Happy birthday to you dear");

       System.out.println(makeAbbr("make American great Again"));
        System.out.println(Abbr);
        System.out.println(makeAbbr("outfit of the day"));
        System.out.println(makeAbbr("good morning"));
        System.out.println(makeAbbr("Happy new year"));
        System.out.println(makeAbbr("happy new year To you dear"));
        System.out.println(makeAbbr("Happy birthday to you"));

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



}
