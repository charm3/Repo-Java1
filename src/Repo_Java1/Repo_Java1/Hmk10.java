package Repo_Java1.Repo_Java1;

import javax.print.DocFlavor;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.security.KeyStore;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hmk10 {

    public static void main(String[] args) {
        /**
         * Question-1:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         * Create method that will print the keys with same value
         *
         * Input to method -> [ {101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"} ]
         * Output (print) ->
         *      "happy" is present with 101, 103, 106 keys
         *      "peace" is present with 102, 105 keys
         *
         * Input to method -> [ {111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"} ]
         * Output (print) ->
         */
         HashMap<Integer, String> happyPair = new HashMap<>();
            happyPair.put(101, "happy");
            happyPair.put(102, "peace");
            happyPair.put(103, "Happy");
            happyPair.put(104, "learn");
            happyPair.put(105, "PEaCe");
            happyPair.put(106, "HAPPY");



       /* int i = 101;
        System.out.println(happyPair + "the size is " + happyPair.size());
        String countValues = happyPair.get(i);
        int y = i + 1;
        Set<Integer> numKey= happyPair.keySet();
        boolean dupWords = countValues.equalsIgnoreCase(happyPair.get(y));

        if (dupWords = true) {
            for (Integer x : happyPair.keySet()) {
                System.out.println( "=" + countValues);
            }
        }

        */


        /*
         * Question-2:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         *
         *      Map<String, Integer>
         */
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};

        HashMap<Integer, String> listWords = new HashMap<>();
        listWords.put(1, "happy");
        listWords.put(2, "peace");
        listWords.put(3, "joy");
        listWords.put(4, "grow");
        listWords.put(5, "joy");
        listWords.put(6, "laugh");
        listWords.put(7, "happy");
        listWords.put(8, "laugh");
        listWords.put(9, "joy");
        Map<String, Long>values=listWords.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Values Count : "+values);


        /**
         * Question-3:
         *
         * Create a method that will take String-array as input
         *
         * Method should return the name(s) of color present max number of times in given String array
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all
         *
         * Hint: return type as Set<String> or List<String>
         */

        String[] arrList = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        Map<Integer, String>arrHash = new HashMap<>();
        arrHash.put(1, "green");
        arrHash.put(2, "blue");
        arrHash.put(3, "red");
        arrHash.put(4, "yellow");
        arrHash.put(5, "grey");
        arrHash.put(6, "green");
        arrHash.put(7, "red");
        arrHash.put(8, "grey");
        arrHash.put(9, "green");
        arrHash.put(10, "blue");
        arrHash.put(11, "yellow");
        arrHash.put(12, "grey");
        arrHash.put(13, "green");
        arrHash.put(14, "blue");
        arrHash.put(15, "green");
        arrHash.put(16, "green");
        arrHash.put(17, "green");
        arrHash.put(18, "green");

        for(String x : arrList) {
        if(!arrHash.containsValue(x)) {
            arrHash.put(1, x);
        }else {
            arrHash.put(Integer.valueOf(arrHash.get(x)+1), x);
        }


    }
    }
}
