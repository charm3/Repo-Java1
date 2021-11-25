package Repo_Java1.Repo_Java1;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        /*
         * Ques-1:
         * Create a method to return an int-array after sorting an input-int-array
         * points: 10
         */
        /*
         *
         * eg:
         * input -> [32, 54, 12, 67, 2, 5]
         * returned array -> [2, 5, 12, 32, 54, 67]
         *
         * input -> [5, 4, 3, 1, 2]
         * returned array -> [1, 2, 3, 4, 5]
         *
         * input -> [90, 34, 12, 4]
         * returned array -> [4, 12, 34, 90]
         *

        /*  Q1 answers: -- not correct;
        public static int sortArray;(int[] inputArray;) {


            int[] origArray = inputArray;
            int tempNum =0;
            for (int i = 0; i < origArray.length; i++) {
                for (int j = i; j < origArray.length; j++) {
                    if (origArray[i] > origArray[j]) {
                        tempNum = origArray[i];
                        origArray[i] = origArray[j];
                        origArray[j] = tempNum;
                    }

                }

            }
            for (int i = 0; i < origArray.length; i++) {
                System.out.println(" " + origArray[i] + " ");


            }

            return;
        }
        */

        // Q2 answers:
        int total = addDigits(323);

        System.out.println(total);
        System.out.println(addDigits(123));
        System.out.println(addDigits(90));

        int[] input1 = {32, 54, 12, 67, 2, 5};
        int temp = 0;
        int[] sortedArray = sortArray(input1);

    }

    public static int[] sortArray(int[] inputArray) {
        int[] origArray = new int[]{};
        int temp = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (origArray[i] > origArray[j]) {
                    temp = origArray[i];
                    origArray[i] = origArray[j];
                    origArray[j] = temp;


                }
            }
        }
        System.out.println(origArray);
        return origArray;
    }

    /* Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * points: 20
     *
     * eg:
     * input -> 123
     * returned value -> 6
     *
     * input -> 323
     * returned array -> 8
     *
     * input -> 90
     * returned array -> 9

     */
    public static int addDigits(int inputNum) {
        int number = inputNum;
        int remainder = 0;
        int sumDigits = 0;
        while (number > 0) {
            remainder = number % 10;
            sumDigits = sumDigits + remainder;
            number = number / 10;
        }
        return sumDigits;
    }


        /**
         * Ques-3:
         * Create a method to print the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         */
        /*
         *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * Method should print ->
         * happy
         * peace
         *
         * input -> {"ab", "abcd", "abc", "abcde", "defg", "koli"} , {"abcde", "jhuy", "plot", "koli"}
         * Method should print ->
         * abcde
         * koli

         */


        public static void getCommon(String sameWords){
            String[] sentence1 = {"happY", "king", "peace", "living standard"};
            String[] sentence2 = {"king kong", "Happy", "PEACE"};
            String  makeString = sentence1.ignorec.contentEquals("happy")
            if(sentence1.toLowerCase().contains("happy")
                && sentence2.toLowerCase().contains("happy"));

        /**
         * Ques-4:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         * points: 40
         */
        /*
         *
         * eg:
         * input -> 23, {23, 54, 67, 12, 34, 23, 56}
         * returned array -> {54, 67, 12, 34, 56}
         *
         * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66}
         * returned array -> {23, 67, 87, 10, 34, 98, 66}
         *
         * input -> 11, {22, 33, 44, 55}
         * returned array -> {22, 33, 44, 55}
         *
         */
    }
}
