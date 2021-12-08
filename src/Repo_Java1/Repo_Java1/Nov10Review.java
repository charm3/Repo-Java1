package Repo_Java1.Repo_Java1;

public class Nov10Review {
    public static void main(String[] args) {
        /* Conditional code/loops/blocks
         * 1. if-else block
         * 2. switch block

        * Syntax for-loop
         *
         * for (initialization; condition; increment) {
         *    // code inside
         *   // for-loop


        String[] words = {"Joy", "Smile", "Learn", "Adeline", "Eric"};
        /* Solution One:
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        Output: Joy
                Smile
                Learn
                Adeline
                Eric

         */
        /* Solution Two:

        for (int i = 0; i <= words.length - 1; i++) {
            System.out.println(words[i]);
        }

        /* Print the array-words in reverse order
        String[] newWords = {"healthy", "spend", "learn", "king", "Adeline", "Eric", "Anxiety"};
        /* Solution One:
        System.out.println(newWords[newWords.length-1]);    initial-value i = 1
        System.out.println(newWords[newWords.length-2]);    i = 2
        System.out.println(newWords[newWords.length-3]);    i = 3
        System.out.println(newWords[newWords.length-4]);    i = 4
        System.out.println(newWords[newWords.length-5]);    i = 5
        System.out.println(newWords[newWords.length-6]);    i = 5
        System.out.println(newWords[newWords.length- newWords.length]); last-value i = newWords.length
        Output: Anxiety
                Eric
                Adeline
                king
                learn
                spend
                healthy

        // Solution Two: for reverse order

        for (int i = 1; i <= newWords.length; i++) {
            System.out.println(newWords[newWords.length - i]);
        }

        * Solution Three: for reverse order
        System.out.println(newWords[newWords.length-1]);    initial-value i = newWords.length-1 (6)
        System.out.println(newWords[newWords.length-2]);    i = newWords.length-1 (5)
        System.out.println(newWords[newWords.length-3]);    i = newWords.length-1 (4)
        System.out.println(newWords[newWords.length-4]);    i = newWords.length-1 (3)
        System.out.println(newWords[newWords.length-5]);    i = newWords.length-1 (2)
        System.out.println(newWords[newWords.length-6]);    i = newWords.length-1 (1)
        System.out.println(newWords[newWords.length- newWords.length]); last-value i = (0)
    */
        String[] newWords = {"healthy", "spend", "learn", "king", "Adeline", "Eric", "Anxiety"};
        for(int i = newWords.length-1; i>=0; i--) {
            System.out.println(newWords[i]);

        }

        int m = 200;
        String s = String.valueOf(m);  //converting int into String using valueOf() method
        System.out.println(s);

        String n = "300";
        Integer o = Integer.valueOf(n); //converting string into integer
        System.out.println(o);



    }
}

