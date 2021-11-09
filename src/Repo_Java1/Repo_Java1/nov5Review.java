package Repo_Java1.Repo_Java1;

import java.util.Locale;

public class nov5Review {
    public static void main(String[] args) {

/* To find the length of a String, Method:length(), return type: int*/


        String cityName = "nEW yORK CIty";
        System.out.println("city name : " + cityName);

        int cityNameLength = cityName.length();
        System.out.println( "\nLength of " + cityName + " is : " + cityNameLength);
     // To convert String value into lowercase, method = loLowerCase(), return type: String
        String cityNameLowercase = cityName.toLowerCase();
        System.out.println("city name in lowercase: " + cityNameLowercase);

        String name = "UnITED StaTeS of AmerICA 123";
        System.out.println(" country name is " + name.toLowerCase());
        System.out.println( "country name is " + name.toUpperCase());
        System.out.println(name);
     /* For comparison, when we need to verify if two strings are having SAME value (ignoring cases).
      method: equalsIgnoreCase(), return type: boolean
     if two strings are having same value, equalsIgnoreCase() methods returns true else false.
     */
        String cityName2 = "New York City";
        boolean isEqual = cityName.equals(cityName2);
        System.out.println("Is " + cityName + " equal to " + cityName2 + "? " + isEqual);

        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityName2);
        System.out.println( "Is " + cityName + "equals to " + cityName2 + " ? : " + isEqualIgnoreCase);

    /*To find if a particular sequence is EXACTLY present in the given string,
        method: contains(),
        input: String
        return type: boolean */

        boolean isContains_new = cityName.contains("new");
        System.out.println("Is " + cityName + " contains new " + isContains_new);

    /*Task: verify if cityName ("nEW yORK CIty) contains "new"
    * Note: pls ignore the cases
    * Expected result: true */

        String checkFor = "new";
    /*  -- Pseudo Coding ---
    *   convert cityName into Uppercase (NEW YORK CITY)
    *   convert checkfor into Uppercase (NEW)
    *   apply contains method on cityName_Up with checkFor_Up -> true */
        String cityName_Uppercase = cityName.toUpperCase();
        checkFor = checkFor.toUpperCase();
        boolean isContains = cityName_Uppercase.contains(checkFor);
        System.out.println( " Is '" + cityName + "' contains '" + checkFor + "' (ignoring cases)? : " + isContains);
    // the printout answer shall be true, or the above three lines can be written as follows:
        boolean isContains2 = cityName.toUpperCase().contains(checkFor.toUpperCase());

        /*To replace a String in a given String
        * method: replace()
        * input: String, String
        * return type: String
        * It will replace all valid instances.
        * This method does not change the value in original variable.
        * It will replace the value in a given String, and return the result. */
        String news = "Health was earlier said to be the ability of the body functioning well.";
        String newsReplace_e_XXX = news.replace( "e",  "XXX");
        System.out.println( "After replace " + newsReplace_e_XXX);
             System.out.println("Original news" + news);
        // the printout shows After replace -> e was replaced with XXX, original sentence untouched.

        /*Please replace all instances of e/E with XXX
        * Pseudo Coding
        * convert news into lowercase
        * replace all e with XXX
        * because users may input any value and replace with any value, so we add variables to e/E and XXX */
        String replaceThis = "e", replaceWith = "XXX";
        String newslowercase = news.toLowerCase();
        String replaceThisLowercase = replaceThis.toLowerCase();
        String newsReplace = newslowercase.replace(replaceThisLowercase, replaceThis);
        System.out.println(newsReplace);

    /* To find the char present at a particular index
    * method: charAt()
    * input: int
    * return type: char
    * if the given index is within the index-range, it will return the char at given index
    * else, it will throw Exception (StringIndexOutOfBoundsException) */
    // cityName = "nEW yORk CIty"
        char charAtIndex4 = cityName.charAt(4);
        System.out.println("\nchar at index-4 in '" + cityName+ "' is: " + charAtIndex4);
    // the printout answer is: y

      /*Task: Write code to print the char at last index of given String */
        String taskString = "Hello dear, how are you?";
        int taskStringLength = taskString.length();
        int lastIndex = taskStringLength - 1;
        char charAtLastIndex = taskString.charAt(lastIndex);
        System.out.println( "char at last index in  '" + taskString + "' is : " + charAtLastIndex);

        /* To find the index of FIRST OCCURRENCE of a string in the given string
        * Method: indexOf()
        * input: String
        * return type: int
        *
        * "the body functioning WEiL."
        * find index of b? --> 4
        * find index of e? --> 2
        * find index of w? --> -1
        *
        * If the given value is found in the given String,
        *   will return the index of FIRST OCCURRENCE of the given value
        * else, will return -1
        * */
        String healthString = "the body functioning WELL";
        int indexOf_b = healthString.indexOf("b");
        System.out.println( "\nIndex of 'b' in  '" + healthString + "' is :" + indexOf_b);

        int indexOf_body = healthString.indexOf("body");
        System.out.println( "Index of 'body' in  '" + healthString + "' is : '" + indexOf_body);
        // the printout answer is 4, because 'body' starts with index 4.

        /*To find the index of LAST OCCURRENCE of a string in the given String
        * "the body of functioning WElL.
        * find index of last occurrence of n? --> 18
        * find index of last occurrence of b? --> 4
        * the printout answers shall be 18, 4     */

        /*To find if the string starts with a given string value
        * method: startsWith()
        * input: String
        * return type: boolean
        * */
        // Below scenario: does cityName start with "new"?  --> false
        boolean isStartWith_new = cityName.startsWith("new");
        System.out.println("\nis '" + cityName + "' starts with 'new'? : " + isStartWith_new);

        boolean isStartWith_n = cityName.startsWith("n");
        System.out.println("is '" + cityName + "' starts with 'n'? : " + isStartWith_n);

        /* to find if the String ends with a given string value
        method: endsWith()
        input: String
        return type: boolean
                 */
        //String cityName = "nNEW yORK CIty";
        boolean isEndsWith_ity = cityName.endsWith("ity");
        System.out.println("\nis '" + cityName+ "' ends with 'ity'?:" + isEndsWith_ity);

        /* Task: Find if cityName value ends with "ity"?
        (Ignore case)
        String cityName = "nNEW yORK CIty";
        String endsWithCheck = "ity";
                 */
        String cityNameLower = cityName.toLowerCase();
        String endsWithCheck = "ity";
        String endsWithCheckLower = endsWithCheck.toLowerCase();
        boolean cityName_Ends = cityNameLower.endsWith(endsWithCheckLower);
        System.out.println("\nis '" + cityName + "' ends with 'ity'?:" + cityName_Ends);













    }


}
