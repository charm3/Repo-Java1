package Repo_Java1.Repo_Java1;

public class Nov3Review {
    public static void main(String[] args) {

         int inc = 5;   // inc = 5
        inc++;          // inc = 6
          System.out.println( "value of inc = " + inc);
            // value of inc = 6
        ++inc;          // inc = 7
            System.out.println( "value of inc = " + inc);
            // value of inc = 7
        System.out.println( "value of inc = " + inc++);
            // value of inc = 7 (inc = 8)
        System.out.println( "value of inc = " + inc );
            // value of inc = 8
        System.out.println( "value of inc = " + ++inc);
            // inc = 9, value of inc = 9

        int num1 = 10;                   // num1 = 10

        num1++;                         // num1 = 11

        int num2 = ++num1;              //pre-increment then Assignment) num1 = 12, num2 = 12

        num2 = num1++;                  // (Assignment then post-increment) num2 = 12, num1 = 13

        System.out.println( "num2 = " + num2);  // "num2 = 12 " (num2 = 12, num1 = 13)

        System.out.println( "num1 = " + ++num1); //





    }
}
