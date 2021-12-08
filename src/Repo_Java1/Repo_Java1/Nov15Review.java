package Repo_Java1.Repo_Java1;

import java.util.Arrays;

public class Nov15Review {
    public static void main(String[] args) {
        /*  method to say hello to the user (eg: Hello username)
        * 1. What is the purpose of method - to say hello to user (name: helloUser)
        * 2. do I need any input from user - yes, String
        * 3. should I return any value in the end of method? - yes,
        *       if yes, then what is the datatype? - (return type = String) (eg: Hello username)
        * */
      helloUser("Adeline");

      helloUser("Eric");
    }
    public static void helloUser(String username){
        String msg = "Hello " + username;
        System.out.println(msg);

        int[] input1 = {23,49,100, 13, 42, 50};
        int[] reversedArray = reverseArray(input1);
        System.out.println((Arrays.toString(reversedArray)));
    }
    /* method to reverse an int-array (eg: [1,2,3,4,5] -> [5,4,3,2,1])
    * 1. What is the purpose of method - to reverse an int-array  (name: reverseArray)
     * 2. do I need any input from user - yes, int[]
     * 3. should I return any value in the end of method? - yes,
     *       if yes, then what is the datatype? - (return type = int[])

     */
    public static int[] reverseArray(int[] inputArray) {
        int[] revArray = new int[inputArray.length];
        /*
        * inputArray = [1,2,3,4,5]
        * reverseArray[0] = inputArray[inputArray.length-1] -- reverseArray[0] = inputArray[5-1-0]
        * reverseArray[1] = inputArray[inputArray.length-2] -- reverseArray[1] = inputArray[5-1-1]
        * reverseArray[2] = inputArray[inputArray.length-3] -- reverseArray[2] = inputArray[5-1-2]
        * reverseArray[3] = inputArray[inputArray.length-4] -- reverseArray[3] = inputArray[5-1-3]
        * reverseArray[4] = inputArray[inputArray.length-5] -- reverseArray[4] = inputArray[5-1-4]
        * reverseArray[i] = inputArray[inputArray.length-i] -- reverseArray[i] = inputArray[5-1-i]
        * i = 0,1,2,3,4,5..lastIndex, i<= lastIndex i++
        * */
        for(int i=0; i <= inputArray.length-1; i++) {
            revArray[i] = inputArray[inputArray.length-1-i];
        }
        return revArray;


    }
}
