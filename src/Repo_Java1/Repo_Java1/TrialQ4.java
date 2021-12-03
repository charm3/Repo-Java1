package Repo_Java1.Repo_Java1;

public class TrialQ4 {
    public static void main(String[] args) {

    }

    /**
     * Ques-4:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 40
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66}
     * returned array -> {23, 67, 87, 10, 34, 98, 66}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     */
    public int[] removeIntFromArray(int value, int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        int[] restOfValuesArr = new int[arr.length - count];
        int j = 0;
        for (int num : arr) {
            restOfValuesArr[j] = num;
            j++;
        }

        return restOfValuesArr;
    }

    public static int[] removeValue(int value, int[] input) {
        int targetCount = 0;
        for (int inputValue : input) {
            if (inputValue == value) {
                targetCount++;
            }
        }
        if (targetCount == 0) {
            return input;
        }
        int[] result = new int[input.length - targetCount];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != value) {
                result[index] = input[i];
                index++;
            }
        }
        return result;
    }
}
