package Repo_Java1.Repo_Java1;

public class Nov12Review2 {
    public static void main(String[] args) {
        /* reverse "learn", reverse "living standard"
        *
        * String newString = "";
        * newString = newString + orgString.charAt(orgString.length()-1) ("n") / newString = n
        * newString = newString + orgString.charAt(orgString.length()-2) ("n") / newString = nr
        * newString = newString + orgString.charAt(orgString.length()-3) ("n") / newString = nra
        * ...
        * newString = newString + orgString.charAt(orgString.length()-orgString.length())
        * lastIndex - letter
        * charAt()
        * newString = newString + orgString.charAt(orgString.length()-i) / i=1,2,3,...length, so i<= length
        *    */

        String orgString = "learn";
        String newString = "";
        for (int i = 1; i<= orgString.length(); i++) {
            newString = newString + orgString.charAt(orgString.length() - i );
        }
        // more professional: newString += orgString.charAt(orgString.length() - i);
        System.out.println("reverse String is  " + newString);

    }
}
