package Repo_Java1.Repo_Java1;

import java.util.*;

public class Hmk9 {
    public static void main(String[] args) {

        // Due date: Wed (Dec-08)

        /**
         * Question 1:
         * Create a method that can find if the given array has any duplicate data or not?
         *
         * Check -> How to create a List using Array
         * My method: if the size of the hashset is shorter than that of the string array,
         * then there are duplicate values. So I will convert the string array  to hashset.
         */

        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};

        System.out.println("the length of the string is  " + words.length); //length is 9
        List<String> listWords = new ArrayList<>();

        listWords.add("happy");
        listWords.add("peace");
        listWords.add("joy");
        listWords.add("grow");
        listWords.add("joy");
        listWords.add("laugh");
        listWords.add("happy");
        listWords.add("laugh");
        listWords.add("joy");
        System.out.println("size of Arraylist 'listWords': " + listWords.size());
        Set<String> listWords_set = new HashSet<>(listWords);
        System.out.println("HashSet size is: " + listWords_set.size());
        if (listWords_set.size() != listWords.size()) {
            System.out.println("String words contain duplicate data.");
        } else {
            System.out.println("String words DO NOT   contain duplicate data.");
        }


        /**
         * Question 2:
         * Create a method that would return the values occurring more than one time in given string-array
         *
         * String[] words2 = {"happy", "peace", "joY", "grow", "joy", "lAugh", "Happy", "laugh", "joY"};
         * ["happy", "joy", "laugh"]
         *
         * convert Array into List
         * indexOf, lastIndexOf
         * add
         * if
         * for
         *
         */

        String[] words2 = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> duplicateWords = new ArrayList<>();
        Collections.addAll(duplicateWords, words2);
        System.out.println(duplicateWords.size());

        boolean isContains_happy = duplicateWords.contains("happy");
        System.out.println(isContains_happy);
        int indexOfHappy = duplicateWords.indexOf("happy");
        System.out.println("happy is at index of " + indexOfHappy);
        int lastIndexOfHappy = duplicateWords.lastIndexOf("happy");
        System.out.println("happy is at last index of " + lastIndexOfHappy);
                }
            }









//    public Set<String> findDuplicates(String[] inputArray) {
//        // code
//    }





