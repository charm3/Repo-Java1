package Repo_Java1.Repo_Java1;

import java.util.Locale;

public class TrialQ3 {
    public static void main(String[] args) {

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
    public void printCommon(String[] array1,String[] array2){

        for (String fromArray1 : array1) {
            for(String fromArray2 : array2){
                if(fromArray1.equalsIgnoreCase((fromArray2))) {
                    System.out.println(fromArray1.toLowerCase());

                }
            }
        }
    }
    public static void getCommon(String[] sentence1,String[]sentence2) {

        for (String word1 : sentence1) {
            for (String word2 : sentence2) {
                if (word1.toLowerCase().equals((word2.toLowerCase()))) {
                    System.out.println(word1.toLowerCase());

                }
            }
        }
    }
}
