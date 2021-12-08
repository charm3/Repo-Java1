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
        String[] arrOldSentence = oldSentence.toLowerCase().split(" ");
        String newSentence = "";

        for (int i = 0; i <= arrOldSentence.length - 1; i++) {
            newSentence += arrOldSentence[i].substring(0, 1).toUpperCase() + arrOldSentence[i].substring(1) + " ";

        }

        System.out.println(newSentence);



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
        String[] arrLearnMo = learnMo.split(" ");
        String moreLearn = "";
        for (int i = 1; i <= arrLearnMo.length; i++) {
            moreLearn += arrLearnMo[arrLearnMo.length - i] + " ";

        }
        System.out.println(moreLearn);

        /* reverse a palindrome string */
        String palindrome = "Dot saw I was Tod";
        String[] arrPalindrome = palindrome.split(" ");
        String revPalindrome = "";
        for (int i = 1; i <= arrPalindrome.length; i++) {
            revPalindrome += arrPalindrome[arrPalindrome.length - i] + " ";
        }
        System.out.println(revPalindrome);

        // happy birthday to you -> you to birthday happy

        String origBirthday = "happy birthday to you";
        String[] arrBirthday = origBirthday.split(" ");
        String reverse = "";
        for (int i = 1; i <= arrBirthday.length; i++) {
            reverse += arrBirthday[arrBirthday.length - i] + " ";
        }
        System.out.println(reverse);

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
        int maxNumber = 0;
        for (int b = 0; b <= origData.length - 1; b++) {
            if (origData[b] > maxNumber)
                maxNumber = origData[b];
        }
        System.out.println(maxNumber);

        int[] fourData = {54, 23, 76, 12};
        int maxNum = 0;
        for (int i = 0; i <= fourData.length - 1; i++) {
            if (fourData[i] > maxNum)
                maxNum = fourData[i];
        }
        System.out.println(maxNum);


        int[] negData = {-9, -34, -4, -7, -2, -21};  // seeking the largest negative number
        int maxValue =0;
        for (int i = 0; i <= negData.length - 1; i++) {
        if (maxValue ==0 || negData[i] > maxValue) {
                    maxValue = negData[i];
        }
            System.out.println("internal" + maxValue);
        }
        System.out.println(maxValue);


        int[] negNum = {-18, -21, 6, -10, - 14, -20};
        int max = 0;
        for(int i = 0; i< negNum.length; i++) {
            if (negNum[i] < max) {
                max = negNum[i]; //seeking smallest number

            }
            System.out.println(max);
        }
        System.out.println(max);

        int arr[] = {2, -1, 4, 1, 0, 7, 2, -3, 5, 9, -4, 5, -9};
        int maxNegative = 0;
        for (int i = 0; i<arr.length; i++) {
            if ( arr[i]>maxNegative){
                maxNegative = arr[i];

            }
        }
        System.out.println(maxNegative);  //see the largest number

        int array[] = {2, -1, 4, 1, 0, 17, 2, -3, 5, -19, -4, 5, -9};
        int minNumb = 0;

        for(int i=0; i< arr.length; i++) {

           if( array[i] < minNumb) {
            minNumb = array[i];
            }
        }
        System.out.println(minNumb);



    }
}









