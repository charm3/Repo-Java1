package Repo_Java1.Repo_Java1;

public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589,12, 1076, 2000, 8, 622, 127};
        int searchFor = 12;
        int i;
        boolean foundIt = false;

        for (i = 0; i< arrayOfInts.length; i++){
            if(arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }
        if(foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
             } else {
            System.out.println(searchFor + " not in the array");
        }
        /*This program searches for the number 12 in an array. The break statement, shown in boldface, terminates
        * the for loop when that value is found. Control flow then transfers to the statement after the for loop.
        * This program's out is: Found 12 at index 4
        * */

    }
}

