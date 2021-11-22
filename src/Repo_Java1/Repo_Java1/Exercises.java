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
        accBalance+=deposit;
        System.out.println("account balance is: " + accBalance);
    }
}
