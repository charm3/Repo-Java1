package Repo_Java1.Repo_Java1;

public class Exercises {
    public static void main(String[] args) {
        int aNumber = 9;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }

        System.out.println("third string");

        double accBalance = 100000;
        double deposit = 100;
        accBalance += deposit;
        System.out.println("account balance is: " + accBalance);

        // array prints out a letter bellow:
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '!'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        System.out.println(helloArray);


        /* reverse a palindrome string */
        String palindrome = "Dot saw I was Tod";

        int len = palindrome.length();
        char[] temCharArray = new char[len];
        char[] charArray = new char[len];


        // put original string in an array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = temCharArray[len - 1 - j];
        }
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);

        //test your progress: two test scores: 89,95, percentage of improvement? such as 21.75%
        double lastTest = 80;
        double thisTest = 90;
        double percentage;
        percentage = ((thisTest - lastTest) / lastTest * 100);
        System.out.printf("%.2f\n", percentage);

        int b1 = 59;
        if (b1 >= 90) {
            System.out.println("优秀");
        } else if (b1 >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("End");

        // compare if the following is the same, the result is false, even if you make lowerCase
        String b2 = "hello";
        String b3 = "HELLO".toLowerCase();
        System.out.println(b2);
        System.out.println(b3);
        if (b2 == b3) {
            System.out.println("b2 == b3");
        } else {
            System.out.println("b2 != b3");
        }

        // to judge if the two are same, must use equals() method:

        String b4 = "hello";
        String b5 = "HELLO".toLowerCase();
        System.out.println(b4);
        System.out.println(b5);
        if (b4.equals(b5)) {
            System.out.println("b4 equals b5");
        } else {
            System.out.println("b4 not equals b5");

        }
        // to avoid NullPointerException mistake, may use &&:
        String b6 = null;
        if (b6 != null && b6.equals("hello")) {
            System.out.println("hello");

        }
    /* this one not using &&, and output shows error.
        String b7 = null;
        if(b7.equals("hello")) {
            System.out.println("hello");
        }
        */
        /* BMI = weight times height square
         * lightweight: < 18.5
         * normal: 18.5 - 25
         * overweight: 25 - 28
         * fat: 28 - 32
         * obese: > 32*/


        double weight = 60.5;
        double height = 155;
        double BMI = weight / (height * height);
        if (BMI > 32) {
            System.out.println("obese");
        }
        if (BMI > 28) {
            System.out.println("Fat");
        }
        if (BMI > 25) {
            System.out.println("overweight");
        }
        if (BMI > 18.5) {
            System.out.println("normal");
        } else {
            System.out.println("lightweight");
        }

        // switch commands, set up default if non matches

        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
        // new way no need to use break, but if more than one line, use {}, not need to use break
        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }

        int opt;
        switch (fruit) {
            case "apple":
                opt = 1;
                break;
            case "pear":
            case "mango":
                opt = 2;
                break;
            default:
                opt = 0;
                break;
        }

        String fruit1 = "pear";
        int opt1 = switch (fruit1) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        };
        System.out.println("opt = " + opt1);

        // we can use Yield, hashCode:
        String fruit2 = "orange";
        int opt2 = switch (fruit2) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit2.hashCode();
                yield code;    //switch return value
            }
        };
        System.out.println("opt = " + opt2); // default in this case -1008851410

        // while loop sum 1 to 100 aggregate

        int sum = 0; // 初始化为0
        int b7 = 1;
        while(b7<=100){
            sum = sum + b7;  // 把b7累加到sum 中
            b7++;
        }
        System.out.println(sum);

        int sum1 = 0;
        int n1 = 1;
        while (n1>0) {

            sum1 = sum1 + n1;
            n1++;
        }
        System.out.println(sum1); //-2147483648, 死循环，int 有最大值，达到最大值后，再加就会变成负数

        int sum2 = 0;
        int m = 20;
        int n = 100;
        while (m<=100 && m>=20) {
            sum2 = sum2 + m;
            m++;
        }
        System.out.println(sum2);

        //do while
        int sum3 = 0; // 初始化为0
        int b8 = 1;

        do {
            sum3 = sum3 + b8;  // 把b8累加到sum3 中
            b8++;
        } while(b8<=100);
        System.out.println(sum3);

        // for loop, most widely used, INITIALIZATION FIRST! index value normally 1
        // add up 1 to 100 aggregate
        int sum4 = 0; // 初始化为0
        for (int i = 1; i<=100; i++){
            sum4 = sum4 + i;  //
        }
        System.out.println(sum4);

        // sum of a series of integers, use for loop
        int[] ns = {1,4,9,16,25};
        int sum5 = 0;
        for (int j = 0; j<ns.length; j++ ) {
            System.out.println(" j = " + j + ", ns[j] = " + ns[j]);
            sum5 = sum5 + ns[j];
        }
        System.out.println("sum = " + sum5);

        // only print out odd numbers

        int[] ns1 = {1,4,9,16,25};
        for(int k=0; k<ns1.length; k= k+2) {
            System.out.println(ns1[k]);
        }



    }


        }








