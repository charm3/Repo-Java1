package Repo_Java1.Repo_Java1;

public class ClassReview {
    public static void main(String[] args) {
        int result = 1 + 2;
        // result is now 3
        System.out.println( ("1 + 2 = " + result));
        int originalResult = result;

        result = result -1;
        //result is now 2
        System.out.println( originalResult + "-1 = " + result);

        result = result * 2;
        // result is now 4
        System.out.println(originalResult + " * 2 = " + result );

        result = result / 2;
        // result is now 2
        System.out.println(originalResult + " /2 = " + result);

        result = result + 8;
        // result is now 10
        System.out.println(originalResult + " + 8 = " + result);

        result = result % 7;
        //result is now 3
        System.out.println(originalResult + " % 7 = " + result);

    String firstString =  "This is";
    String secondString = " a concatenated string.";
    String thirdString = firstString+secondString;
    System.out.println(thirdString);

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        /* Print the letters from array as below:
        Letter at index-0: a
        Letter at index-1: b
        Letter at index-2: c
        ...
        Letter at index-0: Letters[0]
        Letter at index-1: Letters[1]
        Letter at index-i: Letters[i] // i=0,1,2,...lastIndex
         */

        for (int k = 0; k <= letters.length - 1; k++) {
            System.out.println(" Letter at index - " + k + " : " + letters[k]);
        }

        int w = 0;
        while (w <= letters.length-1) {
            System.out.println( " Letter at index-" + w + " : " + letters[w]);
            w++;
        }
        int d=0;
        do{
            System.out.println(" Letter at index -" + d + " : " + letters[d]);
            d++;
        } while (d <= letters.length-1);

    }
}
