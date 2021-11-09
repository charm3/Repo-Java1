package Repo_Java1.Repo_Java1;

public class Hwk3a {
    public static void main(String[] args) {
         /* Sentence1 = "Hello dear, how are you doing?";
         Store 100 in result1 if the length of sentence1 is greater than or equal to 10,
         else store 150 in result
         use: Ternary operator "
          */
        String sentence1 = "Hello dear, how are you doing?";
        int sentenceLength = sentence1.length();
                System.out.println("the length of sentence1 is " + sentenceLength);
        /* length is 30,   */
        int result1 = sentenceLength>=10?100 : 150;
        System.out.println("If length >=10, the result1 is: " + result1);

        int result2 = sentenceLength<10?100:150;
        System.out.println("If length <10, the result2 is: " + result2);

        /* replace all instances of a/A with Z below
                */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String replaceThis = "a", replaceWith = "Z";
        String Sent2Lowercase = sentence2.toLowerCase();
        String replaceThisLowercase = replaceThis.toLowerCase();
        String sentence2aAToZ = Sent2Lowercase.replace(replaceThisLowercase, replaceWith);
        System.out.println( sentence2aAToZ);


        /* Print 1. the length of the sentence3-value.
        2. result if the sentence3 starts with "health" (ignoring cases)
        3. result if the sentence2 contains "Body" (ignoring cases)
        4. index of "Body" in sentence3
        */
        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WEIL.";
        int sentence3Length = sentence3.length();
        System.out.println( "\nthe length of sentence3 is: '" + sentence3Length + "'");

    // 2. result if the sentence3 starts with "health" (ignoring cases).

        String sent3Lowercase = sentence3.toLowerCase();
        String healthLowercase = "health".toLowerCase();
        boolean sentence3Start = sent3Lowercase.startsWith(healthLowercase);
        System.out.println( "is sentence3 starts with '" + healthLowercase + "'? " + sentence3Start);

    // below to check if sentence3 contains "Body" ignoring cases
        String checkIf = "Body";
        String sent3Uppercase = sentence3.toUpperCase(); checkIf = checkIf.toUpperCase();
        boolean resultX = sent3Uppercase.contains(checkIf);
        System.out.println("is sentence3 contains '" + checkIf + "'? " + resultX);

        int indexOfBody = sentence3.indexOf("Body");
        System.out.println("Index of Body in '" + sentence3 + "' is: " + indexOfBody);

    }
}

