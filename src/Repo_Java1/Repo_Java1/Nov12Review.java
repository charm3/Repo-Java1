package Repo_Java1.Repo_Java1;

public class Nov12Review {
    public static void main(String[] args) {

        /* for-loop, Print the values index at even index-values
        Solution One:
        sout(oldWords[0])
        sout(oldWords[2])
        ...
        sout(oldWords[i]) i=0,2,4,6...lastIndex
        lastIndex = oldWords.length - 1;

        Solution Two:
        String[] oldWords = {"healthy", "speak", "learning", "Adeline", "Eric", "living standard", "life"};
        for (int i = 0; i <= oldWords.length - 1; i += 2) {
            System.out.println(oldWords[i]);

        Solution Three:
        i = 0
        check if i-value is even, print value at words[i]
        i = 1
        check if i-value is even, print value at words[i]
         i = 2
        check if i-value is even, print value at words[i]
         i = 3
        check if i-value is even, print value at words[i]
        i = 0,1,2,3,...lastIndex


        String[] oldWords = {"healthy", "speak", "learning", "Adeline", "Eric", "living standard", "life"};
        for (int i = 0; i<= oldWords.length-1; i++) {
            if (i%2 == 0) {
                System.out.println(oldWords[i]);

            }
         }
          */
        /* Print the values which has length greater than 5 and starts with l
        pseudo coding:  expected answer: learning, living standard
         * words[0]
        * if (words[0].length > 5 && words[0].startsWith("l")) {
            sout(words[0])
            }
            if (words[1].length > 5 && words[1].startsWith("l")) {
            sout(words[1])
            }
            if (words[2].length > 5 && words[2].startsWith("l")) {
            sout(words[2])
            }
            ...
            ...
            if (words[lastIndex].length > 5 && words[lastIndex].startsWith("l")) {
            sout(words[lastIndex])
            }
            if (words[i].length > 5 && words[i].startsWith("l")) {
            sout(words[i])
            }


                */
        String[] oldWords = {"healthy", "speak", "learning", "Adeline", "Eric", "living standard", "life"};
        for (int i = 0; i <= oldWords.length - 1; i++) {
            if (oldWords[i].length() > 5 && oldWords[i].startsWith("l")) {
                System.out.println(oldWords[i]);

            }
        }

        int[] numb = {90, 89, 78, 35, 69, 30};
        /*
         * find the average of array
         * sum of values/number of values
         * make total = numb[0];
         * 90 + 89 = 179 (total = numb[0] + numb[1]) --> total = total + numb[1]
         * 179 + 78 = 257 (total = total + numb[2])
         * 257 + 35 = 292 (total = total + numb[3])
         * ...
         * total = 391 this line shall be outside loop
         * 391/6 =
         * */
        double total = numb[0];
        for (int i = 0; i <= numb.length - 1; i++) {
            total = total + numb[i]; //use: total+=numb[i], more professional
        }
        System.out.println(total / numb.length);

        /*Enhanced for-loop (only with Array and Collections)
         * Syntax:
         * for(datatype varName : arrName) {
         *  code inside the loop }  */

        String[] newWords = {"healthy", "speak", "learning", "Adeline", "Eric", "living standard", "life"};
        // word = newWords[0]
        for (String word : newWords) {
            if (word.length() > 5 && word.startsWith("l")) {
                System.out.println(word);

            }
        }
        double[] acctBalance = {2909.90, 989.89, 93840.07, 38, 29480};
        /* if account balance is less than 1000, print the index of acctBalance and its value
        acctBalance[0] < 1000, sout (acctBalance[0]), sout("balance index" + 0)
        acctBalance[1] < 1000, sout (acctBalance[1]), sout("balance index" + 1)
        ...
        acctBalance[lastIndex] < 1000
        sout (acctBalance[lastIndex]),
        sout("balance index" + lastIndex)


         */
        for (int i = 0; i <= acctBalance.length - 1; i++) {
            if (acctBalance[i] < 1000) {
                System.out.println(acctBalance[i]);
                System.out.println("Balance index: " + i);

            }
        }
        // use Enhanced loop:
        for (double balance : acctBalance) {
            if (balance < 1000) {
                System.out.println("Balance amount: " + balance);
            }
        }
        /* use while loop:
         * initialization
         * while (condition) {
         *  until condition is true
         * run the code inside loop
         * increment/decrement }
         *
         */
        int index = 0;
        while (index <= acctBalance.length - 1) {
            if (acctBalance[index] < 1000) {
                System.out.println("Balance amount: " + acctBalance[index]);
                index++;
            }
        }
        /* do-while loop'
         * initialization
         * do {
         *   // until the condition is true
         *   // run the code inside the loop
         * increment/decrement
         * } while (condition)
         * */
        int doIndex = 0;
        do {
            if (acctBalance[doIndex] < 1000) {
                System.out.println(" Balance amount: " + acctBalance[doIndex]);
            }
            doIndex++;
        } while (doIndex <= acctBalance.length - 1);




    }
}




