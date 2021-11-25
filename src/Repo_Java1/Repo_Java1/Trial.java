package Repo_Java1.Repo_Java1;


public class Trial {
    public static void main(String[] args) {

        int total = addDigits(323);

        System.out.println(total);
        System.out.println(addDigits(123));
        System.out.println(addDigits(90));
    }

    public static int addDigits(int  inputNum) {
        int number = inputNum;
        int remainder = 0;
        int sumDigits = 0;
        while (number > 0) {
            remainder = number % 10;
            sumDigits = sumDigits + remainder;
            number = number / 10;
        }
        return sumDigits;


    }
}

