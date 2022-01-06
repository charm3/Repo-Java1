package Repo_Java1.Repo_Java1;

public class CodeTest2 {
    public static void main(String[] args) {

        /*
         * Ques-1:
         * Create a method to return a max value from an input-int-array
         * points: 10
         */
        /* eg:
         * input -> [32, 54, 12, 67, 2, 5]
         * returned value -> 67
         *
         * input -> [5, 4, 3, 1, 2]
         * returned value -> 5
         *
         * input -> [90, 34, 12, 4]
         * returned value -> 90
         *
         * input -> [-15, -4, -12, -7]
         * returned value -> -4
         */

        int[] origData = {32, 54, 12, 67, 2, 5};
        int maxNumber = 0;
        for (int b = 0; b <= origData.length - 1; b++) {
            if (origData[b] > maxNumber)
                maxNumber = origData[b];
        }
        System.out.println(maxNumber);

        /*
         * Ques-2:
         * Create a method to return factorial value of input-int-value
         * points: 20
         */
        /*
         * eg:
         * input -> 5
         * returned value -> (5*4*3*2*1) = 120
         *
         * input -> 1
         * returned value -> (1) = 1
         *
         * input -> 3
         * returned value -> (3*2*1) = 6
         *
         * input -> 10
         * returned value -> (10*9*8*7*6*5*4*3*2*1) = 3628800
         */
        int inputNum = 5;
        int factorNum = 1;

        for (int i = 1; i <= inputNum; i++) {
            factorNum = i * factorNum;

        }
        System.out.println(factorNum);

        /**
         * Ques-3:
         * Create a method to return the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         */
        /*       *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * returned value -> [happy, peace]
         *
         * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
         * returned value -> [abcde, koli]
         *
         */
        String[] string1 = {"happY", "king", "peace", "living standard"};
        String[] string2 = {"king kong", "Happy", "PEACE"};

        for (int j = 0; j < string1.length; j++) {
            for (int k = 0; k < string2.length; k++) {
                if (string1[j].toLowerCase().equals(string2[k].toLowerCase())) {
                    System.out.println(string1[j].toLowerCase());
                    break;
                }
            }
        }

        /*
         * Ques-4:
         * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
         * points: 40
         */
        /*
         * eg:
         * 	input -> : {3, 5, 1, 4, 2, 7}
         * 	returned value : 6
         *
         * 	input -> {2, 5, -1, 0, 6}
         * 	returned value : 1
         *
         * 	input -> {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	returned value : 4
         *
         * 	input -> {-2, -5, -1, -10, -6}
         * 	returned value : 1
         */


        int[] givenInput = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        int arrLength = givenInput.length;
        boolean[] present = new boolean[arrLength + 1];
        for (int m = 0; m < arrLength; m++) {
            if (givenInput[m] > 0 && givenInput[m] < arrLength)

                    if (!present[m]) ;
                    return;
                }
        System.out.println(present);


        }
    }

