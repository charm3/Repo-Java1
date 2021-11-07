package Repo_Java1.Repo_Java1;

public class nov5Review {
    public static void main(String[] args) {
        String cityName = "nEW yORK CIty";
        System.out.println("city name : " + cityName);

        int cityNameLength = cityName.length();
        System.out.println( "\nLength of " + cityName + " is : " + cityNameLength);

        String cityNameLowercase = cityName.toLowerCase();
        System.out.println("city name in lowercase: " + cityNameLowercase);

        String name = "UnITED StaTeS of AmerICA 123";
        System.out.println(" country name is " + name.toLowerCase());
        System.out.println( "country name is " + name.toUpperCase());
        System.out.println(name);

        String cityName2 = "New York City";
        boolean isEqual = cityName.equals(cityName2);
        System.out.println("Is " + cityName + " equal to " + cityName2 + "? " + isEqual);


        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityName2);
        System.out.println( "Is " + cityName + "equals to " + cityName2 + " ? : " + isEqualIgnoreCase);

        boolean isContains_new = cityName.contains("new");
        System.out.println("Is " + cityName + " contains new " + isContains_new);

        String cityName5 = "New York";
        String cityName6 = "new york";
        boolean isCantanis = cityName5.toUpperCase().contains("NEW YORK");
        System.out.println( " Is " + cityName5 + " contains 'NEW' ?: " + isCantanis);

        String news = "Health was earlier said to be the ability of the body funcitoning well.";
        String newsReplace_e_XXX = news.replace( "e",  "XXX");
        System.out.println( "After replace " + newsReplace_e_XXX);

        String taskString = "Write code to print the char at last index";
        int taskStringLength = taskString.length();
        int lastIndex = taskStringLength - 1;
        char charAtLastIndex = taskString.charAt(lastIndex);
        System.out.println( "char at last index in  '" + taskString + "' is : " + charAtLastIndex);

        String healthString = "the body functioning WELL";
        int indexOf_b = healthString.indexOf("b");
        System.out.println( "\nIndex of 'b' in  '" + healthString + "' is :" + indexOf_b);

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
        String cityNameX = "nNEW yORK CIty";
        String endsWithCheck = "ity";
        String endsWithCheckLower = endsWithCheck.toLowerCase();
        String cityNameXLower = cityNameX.toLowerCase();
        boolean cityNameX_Ends = cityNameXLower.endsWith(endsWithCheckLower);
        System.out.println("\nis '" + cityNameX + "' ends with 'ity'?:" + cityNameX_Ends);
        












    }


}
