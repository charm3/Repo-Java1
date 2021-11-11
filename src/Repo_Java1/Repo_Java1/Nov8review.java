package Repo_Java1.Repo_Java1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nov8review {
    public static void main(String[] args) {
        /* To fetch a portion of String from given String using index values
        * Method: subString()
        * return type: String
        *  */

        /*"given string value
        * give me data from index-1 to index-4 --> "give"
        * give me data from index-2 --> "ven string value"
        * Input is only beginIndex:
        *   If the beginIndex is value
        *       return String from beginIndex to end of the String
        *   else
        *       StringIndexOutOfBoundsException
        * Input is ony beginIndex and endIndex:
        *   if the beginIndex and endIndex are valid
        *       return String from beginIndex to endIndex-1
        *   else
        *       StringIndexOutOfBoundsException
        * --> This method does not change the value in original variable.
        * */

        String myString = "Health was Earlier said to Be the ability of the body functioning WElL. Health was Earlier said to Be...";
        System.out.println("myString = " + myString);

        String myString_1To5 = myString.substring(1,5);
        System.out.println("myString_1To5 = " + myString_1To5);

        String myString_From2 = myString.substring(2);
        System.out.println("myString_From2 = " + myString_From2);

        /*To sprlit a String from a specific point into multiple String values
        *
        * method: split()
        * return type: String[]*/

        String stringHealth = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String[] afterSplitBy_O = stringHealth.split("o");

        // shortcut to print Array
        System.out.println(Arrays.toString(afterSplitBy_O));

       String[] afterSplitBy_Space = stringHealth.split(" "); // when we want to divide String into every word
        System.out.println(Arrays.toString(afterSplitBy_Space));

        String[] afterSplitBy_Nothing = stringHealth.split(""); //Array with every character at each index
        //"H", "e", "a", ...
        System.out.println( "Array after split by \"\" --> "  + Arrays.toString(afterSplitBy_Nothing));

        /* Arrays - not a primitive datatype, which can store multiple values of same datatype.
         Strings are always stored in Index,
          Arrays has its own indexing, don't be confused!

          Things to know before creating an Array;
          1. What will be the data type of values that I want to store in Array.
          2. a: Total number of values that I want to store in Array.
             OR
             b. All the values that I want to store in Array.
          Syntax to create an Array:
            if 1 and 2a:
            datatype[] arrName = new datatype [totalNumber]; //will create ampty array to store totalNumber values
            if 1 and 2b:
            datatype[] arrName = {value1,value2,value3, value4, value5}; */

        // Example: Store top-5 profit making companies of 2021
        // 1. String, 2a. 5
        String[] top5Companies2021 = new String[5];
        //Array --> [  ,  ,  ,  ,  ]
        // Index -->  0  1  2  3  4

        top5Companies2021[1] = "Google";
        top5Companies2021[4] = "Meta";
        top5Companies2021[2] = "Amazon";
        top5Companies2021[0] = "Tesla";
        top5Companies2021[3] = "Technosoft";

        // Print all top-5 company names
        System.out.println(Arrays.toString(top5Companies2021));

        // Print true if the most profitable company name is Tesla   (Tesla)
        // Print the value of any index
        System.out.println(top5Companies2021[0]);
        // top5Companies2021[0] represents the value at index-0 in top5Companies2021-Array
        boolean isTesla = top5Companies2021[0].equalsIgnoreCase("tesla");
        // Instead of using above 3 lines, you can use one line below:
        System.out.println("Is tesla most profitable: " + top5Companies2021[0].equalsIgnoreCase("tesla"));

        /* To retrieve the value from a specific index in an Array
        * arrName[IndexValue] represents the value at index mentioned in the square-bracket.*/

        /* Example: bill1 = 100.0
        * bill2 = 90.92
        * bill3 = 60
        * bill4 = 65.98
        * bill6 = 231.78
        * bill7 = 67.09
        * 1. double
        * 2. 2b   */
        double[] bills = {100, 90.92, 60, 65.98, 231.78, 67.09};


        // Print total amount spent

        double totalBills = bills[0] + bills[1] + bills[2] + bills[4] + bills[5];
        System.out.println("\ntotal bill: " + totalBills);




    }
}
