package Repo_Java1.Repo_Java1;

public class TrialQ1 {

    public static void main(String[] args) {


        }


        public static int[] sortArray(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (inputArray[j] < inputArray[j - 1]) {
                    inputArray[j] = inputArray[j] + inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j] - inputArray[j - 1];
                    inputArray[j] = inputArray[j] - inputArray[j - 1];
                }

            }

        }
        return inputArray;

    }



}














