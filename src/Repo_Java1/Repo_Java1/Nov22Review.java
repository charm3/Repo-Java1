package Repo_Java1.Repo_Java1;

import java.sql.SQLOutput;

public class Nov22Review {
    public static void main(String[] args) {


        /* OOPS Concept
         * 1. Encapsulation
         * 2. Abstraction
         * 3. Inheritance
         * 4. Polymorphism
         *       -- same name but different forms
         *       -- in Java, when we have two or more methods with SAME name but different input-parameters and code
         *       -- Types:
         *       1. Compile time Polymorphism
         *       2. Run time Polymorphism
         * */
        Calculator cal = new Calculator();
        System.out.println(cal.add3Ints(2,3,4));
    }

}
