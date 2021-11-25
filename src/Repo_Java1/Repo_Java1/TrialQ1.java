package Repo_Java1.Repo_Java1;

public class TrialQ1 {
    public static void main(String[] args) {





    }


    public static int sortArray(int[] inputArray) {

        int[] origArray = inputArray;
        int tempNum =0;
        for (int i = 0; i < origArray.length; i++) {
            for (int j = i; j < origArray.length; j++) {
                if (origArray[i] > origArray[j]) {
                    tempNum = origArray[i];
                    origArray[i] = origArray[j];
                    origArray[j] = tempNum;
                }

            }

        }
        for (int i = 0; i < origArray.length; i++) {
            System.out.println(" " + origArray[i] + " ");


        }

        return tempNum;
    }

}














