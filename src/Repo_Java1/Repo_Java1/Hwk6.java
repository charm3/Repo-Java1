package Repo_Java1.Repo_Java1;


import java.util.Locale;

public class Hwk6 {
    public static void main(String[] args) {

        /*
         * Q1:
         * Create the abbreviation for sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         * Good morning -> GM
         * Happy new Year -> HNY
         * Happy birthday to you dear -> HBTYD
         * happy new year to you dear -> HNYTYD
         *
         */
        /* megaSplit[0].charAt(0)
         * megaSplit[1].charAt(0)
         */
        String sentenceMAGA = "make America great again";
        String[] arrSentenceMAGA = sentenceMAGA.toUpperCase().split(" ");
        String megaAcronym = "";
        for (int i = 0; i < arrSentenceMAGA.length; i++) {
            megaAcronym += arrSentenceMAGA[i].charAt(0);
        }
        System.out.println(megaAcronym);

        // outfit of the day -> OOTD
        String sentenceOOTD = "outfit of the day";
        String[] arrSentenceOOTD = sentenceOOTD.toUpperCase().split(" ");
        String ootdAcronym = "";
        for (int i = 0; i < arrSentenceOOTD.length; i++) {
            ootdAcronym += arrSentenceOOTD[i].charAt(0);
        }
        System.out.println(ootdAcronym);

        //happy birthday to you -> HBTY
        String sentenceHBTY = "happy birthday to you";
        String[] arrSentenceHBTY = sentenceHBTY.toUpperCase().split(" ");
        String hbtyAcronym = "";
        for (int i = 0; i < arrSentenceHBTY.length; i++) {
            hbtyAcronym += arrSentenceHBTY[i].charAt(0);
        }
        System.out.println(hbtyAcronym);


        /*
         * Q2:
         * Change the given sentence in title case
         *
         * HappY nEW YEAR to YoU dEAr -> Happy New year To You Dear
         * String oldSentence = HappY nEW YEAR to YoU dEAr
         * String newSentence = Happy New year To You Dear
         * oldSentence.toLowercase
         * String[] oldSentence.toLowercase.split
         *
         *
         * gooD morNING -> Good Morning
         * make AMERICA GreAT AgAIn -> Make America Great Again
         *
         */
        String oldSentence = "HappY nEW YEAR to YoU dEAr";
        String[] arrOldSentence = oldSentence.toLowerCase().split("  ");
        String newSentence = " ";

        for (int i = 0; i <= arrOldSentence.length - 1; i++) {
            newSentence += arrOldSentence[i];

            System.out.println(newSentence);
        }


        /*
         * Q3:
         * Reverse a String
         *
         * Learn -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         *
         */

        //Reverse Learn
        String origString = "Learn";
        String newString = "";
        for (int i = 1; i <= origString.length(); i++) {
            newString = newString + origString.charAt(origString.length() - i);
        }
        System.out.println("reverse learn: " + newString);


        //  learn more -< more learn
        String learnMo = "learn more";
        String[] arrLearnMo = learnMo.split("  ");
        String moreLearn = "  ";
        for (int i = 1; i <= arrLearnMo.length; i++) {
            System.out.println(arrLearnMo[arrLearnMo.length - i]);
        }

        // happy birthday to you -> you to birthday happy

        String origBirthday = "happy birthday to you";

        String[] arrBirthday = origBirthday.split("  ");
        for (int i = 1; i <= arrBirthday.length; i++) {
            System.out.println(arrBirthday[arrBirthday.length - i]);
        }


        /*
         * Q4:
         * Find the maximum value from given int-array
         *
         * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
         *
         * int[] = {23, 54, 76, 12}     ->  76
         *
         * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
         */
        int[] origData = {23, 54, 76, 12, 67, 90, 23};
        String maxNumber = "";
        for (int b = 0; b <= origData.length - 1; b++) {
            if (origData[origData.length] > origData[b]) ;
            System.out.println(maxNumber);
        }
        }


    }



