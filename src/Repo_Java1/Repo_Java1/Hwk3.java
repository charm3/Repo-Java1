package Repo_Java1.Repo_Java1;

public class Hwk3 {
    public static void main(String[] args) {
         /* Sentence1 = "Hello dear, how are you doing?";
         Store 100 in result1 if the length of sentence1 is greater than or equal to 10,
         else store 150 in result
         use: Ternary operator "
          */
        String sentence1 = "Hello dear, how are you doing?";
        int store100 = 100;
        int store150 = 150;
        int sentenceLength = sentence1.length();
                System.out.println("the length of sentence1 is " + sentenceLength);
        /* length is 30,   */
        int result1 = sentenceLength>=10?store100:store150;
        System.out.println("If length >=10, the result1 is " + result1);

        int result2 = sentenceLength<10?store100:store150;
        System.out.println("If length <10, the result2 is " + result2);

        /* replace all instanced of a/A with Z below
                */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String toLowercase = sentence2.toLowerCase();
        String sentence2aAToZ = sentence2.replace("a", "Z");
        System.out.println( "\nReplaced sentence2 is: '" + sentence2aAToZ + "'");

        /* Print 1. the length of the sentence3-value.
        2. result if the sentence3 starts with "health" (ignoring cases)
        3. result if the sentence2 contains "Body" (ignoring cases)
        4. index of "Body" in sentence3
        */
        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WEIL.";
        int sentence3Length = sentence3.length();
        System.out.println( "\nthe length of sentence3 is: '" + sentence3Length + "'");

        String startWith = "health";
        boolean sentence3Ignore = startWith.equalsIgnoreCase(startWith);
        boolean sentence3Start = sentence3.startsWith(startWith);
        System.out.println( "is sentence3 starts with '" +startWith + "'? " + sentence3Ignore );

        String sentence3Contains = "Body";
        boolean sentence3Ignore1 = sentence3Contains.equalsIgnoreCase(sentence3Contains);
        System.out.println("is sentence3 contains '" +sentence3Contains + "'? " + sentence3Ignore1 );

        int indexOfBody = sentence3.indexOf("Body");
        System.out.println("Index of Body in '" + sentence3 + "' is: " + indexOfBody);

    }
}
