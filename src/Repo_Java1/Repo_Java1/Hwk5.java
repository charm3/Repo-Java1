package Repo_Java1.Repo_Java1;

public class Hwk5 {
    public static void main(String[] args) {

        /* Create an int variable and store any value in it.
         * if the number is divisible by 5, print "divisible by 5"
         * if the number is divisible by 3, print "divisible by 3"
         * if the number is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the number is NOT divisible by 5, 3, or 15, print the value in int-variable
         *
         * int num = 45
         */
        int number = 45;
        if (number % 5 == 0) {
            System.out.println("number is divisible by 5");
        } else if (number % 3 == 0) {
            System.out.println("number is divisible by 3");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("number is divisible by 5 and 3");
        } else if (number % 5 != 0 || number % 3 != 0 || number % 15 != 0) {
        }
        System.out.println("the value in int-variable is " + number);

        /*
         * Create two variable, one to store student-score and another to store the max-score.
         * If student-score is NOT valid, print error statement, "Invalid student score entered"
         * based on the student scoring percentage, print the grade.
         *
         * Grade-A: 91-100%
         * Grade-B: 81-90.99%
         * Grade-C: 71-80.99%
         * Grade-D: 61-70.00%
         * Grade-E: less than 61
         *
         * (double) myScore = 180
         * (int) maxScore = 200
         *
         * (180/200)*100
         */
        double myScore = 180;
        int maxScore = 200;
        double myGrade = myScore / maxScore * 100;

    if (myGrade >= 91 && myGrade<=100){
        System.out.println("my Grade is A");
    } else if (myGrade >= 81 && myGrade < 91){
        System.out.println("my grade is B");
    }else if (myGrade >= 71 && myGrade <81){
        System.out.println("my grade is C");
    } else if (myGrade >=61 && myGrade < 71){
        System.out.println("my grade is D ");
    } else if (myGrade < 61){
        System.out.println("my grade is E ");
    } else
        System.out.println( " invalid score is entered");

    String[] newWords = {"healthy", "Adeline", "Eric", "king", "smile", "learn"};
    for(int i=1; i<= newWords.length; i++) {
        System.out.println(newWords[newWords.length-i]);
    } //reverse order

        String[] revWords = {"healthy", "Adeline", "Eric", "king", "smile", "learn"};
    for(int i = revWords.length-1; i>=0; i--) {
        System.out.println(revWords[i]);  //another way to reverse order
    }

    String palindrome = "Dot saw I was Tod";
    int len = palindrome.length();
    char[] temCharArray = new char[len];
    char[] charArray = new char[len];
    //put original string in an array of chars
        for(int i =0; i<len; i++) {
            temCharArray[i] = palindrome.charAt(i);
        }
        //reverse array of chars
        for(int j=0; j<len; j++) {
            charArray[j] = temCharArray[len-1-j];
        }
    String revsePalindrome = new String(charArray);
        System.out.println(revsePalindrome);

    }

 }





