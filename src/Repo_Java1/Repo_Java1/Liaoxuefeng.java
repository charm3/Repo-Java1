package Repo_Java1.Repo_Java1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Liaoxuefeng {
    public static void main(String[] args) {
        double d = 3.1415926;
        System.out.printf("%.2f\n", d);
        System.out.printf("%.4f\n", d);

        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); //

        /**Scanner input = new Scanner(System.in);
         System.out.println("\nInput your name: ");
         String name = input.nextLine();
         System.out.print("Input your age: ");
         int age = input.nextInt();
         System.out.printf("Hi, %s, you are %d.\n", name, age);
         */

        int grade = 82;
        if (grade > 90) {
            System.out.println("\nExcellent");
            System.out.println("Congratulations!");
        } else if (grade >= 80) {
            System.out.println("\nGood");
        } else if (grade >= 60) {
            System.out.println("\n Pass ");
        } else
            System.out.println("\nFail");

        String greeting = "kello";
        String Greeting = "HeLLO".toLowerCase();
        if (greeting.equals(Greeting)) {
            System.out.println("They are equal.");
        } else {
            System.out.println(" They are not equal.");
        }
        int option = 34;
        switch (option) {
            case 2:
                System.out.println("Selected 2");
                break;
            case 5:
                System.out.println("Selected 5");
                break;
            case 34:
                System.out.println("Selected 34");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
        // add 1 to 100 in aggregated way:
        int sum = 0;
        int beginNum = 1;
        while (beginNum <= 100) {
            sum = sum + beginNum;
            beginNum++;
        }
        System.out.println(sum);

// do while, add up from 20 to 100 aggregate
        int sum1 = 0;
        int beginNum1 = 20;

        do {
            sum1 = sum1 + beginNum1;
            beginNum1++;
        } while (beginNum1 <= 100);
        System.out.println(sum1);

        // using for loop, add 1 to 100;
        int sum3 = 0;
        for (int i = 1; i <= 100; i++) {
            sum3 = sum3 + i;
        }
        System.out.println("here" + sum3);
        // sum of the numbers:
        int[] numSeq = {1, 4, 9, 16, 25};
        int total = 0;
        for (int i = 0; i < numSeq.length; i++) {
            System.out.println(" i = " + i + ", numSeq[i] = " + numSeq[i]);
            total = total + numSeq[i];
        }
        System.out.println("Total = " + total);

        int[] ns3 = {4, 9, 16, 25, 26, 31, 35}; // find out odd numbers

        for (int k = 0; k < ns3.length; k++) {
            if (ns3[k] % 2 != 0) {
                System.out.print(ns3[k] + ", ");
            }

        }


        // break;
        int addSum = 0;
        for (int l = 1; ; l++) {
            addSum = addSum + l;
            if (l == 100) {
                break;
            }
        }
        System.out.println("the sum is :  " + addSum);

        // find even numbers
        int newSum = 0;
        for (int m = 1; m <= 10; m++) {
            System.out.println("begin m = " + m);
            if (m % 2 == 0) {
                continue;  //continue word will end the loop
            }
            newSum += m;
            System.out.println("end m = " + m);
        }
        System.out.println(newSum);


        String[] ss = new String[]{"Orange", "Apple", "Pear"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
    }

    }






