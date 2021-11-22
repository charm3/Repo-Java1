package Repo_Java1.Repo_Java1;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        /* An unlabeled break statement terminates the innermost switch, for, while, or do-while
         * statement, but a labeled break terminates an out statement. The following program is similar to the previous
         * program, but uses nested for loops to search for a value in a two-dimensional array.
         * When the value is found, a labeled break terminates the outer for loop(labeled "search"
         * */
        int[][] arrayOfInts = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        int searchFor = 12;
        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchFor + "at " + i + ", " + j);
        }else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
 // This is the output: Found 12 at 1, 0

