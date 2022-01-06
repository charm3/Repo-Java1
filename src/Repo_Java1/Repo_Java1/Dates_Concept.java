package Repo_Java1.Repo_Java1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates_Concept {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat df = new SimpleDateFormat("H-a");
        String amPm = df.format(now);
        System.out.println(amPm);

        // print date from the Date-object in format --> fullMonthName date Year
        /*M: month in number (7)
        * MM: month in number (07)
        * MMM: month in abbreviation (Jul)
        * MMMM: month name in full (July)
        * yy: last 2 digits of year (21)
        * yyyy: year in full (2021)
        * if current date is in single digit
        * d: 7
        * dd: 07
        * if current date is double digits
        * d: 11
        * dd: 11
        * so on...

         */
        Date currDate = new Date();
    SimpleDateFormat dateOnly = new SimpleDateFormat("d");
    /*if current date is < 15, print out '
    * else
    * print we are in second half of the month*/

        String dateString = dateOnly.format(currDate);
        int dateInteger = Integer.valueOf(dateString);
        if (dateInteger < 15) {
            System.out.println("We are in first half of the month");
        } else {
            System.out.println("We are in second half of the month");
        }
    // Create a date object using String value
        Date newDate = null;
        String dateText = "01/01/22 9:15:22 am";
        SimpleDateFormat makeDate = new SimpleDateFormat("MM/dd/yy h:mm:ss a");
        try {
            newDate = makeDate.parse(dateText);
            System.out.println("Date after conversion -->" + newDate);
        } catch (ParseException e) {
            e.printStackTrace();

        }

        // to verify if two dates are equal, method: equals, return type: boolean
        boolean isNowEqualsNewDate = now.equals(newDate);
        System.out.println("\nis now equals to newDate -->" + isNowEqualsNewDate);

        /* to verify if one date come before another date
        Method: before
        return type: boolean
         */
        Date newDate2 = new Date("02/24/22");
        boolean isNowBeforeNewDate = now.before(newDate2);
        System.out.println("\nis now comes before newDate -->" + isNowBeforeNewDate);

        /*to verify if one date come after another date
        * Method: after
        * return type: boolean
        * */
        boolean isNowAfterNewDate = now.after(newDate);
        System.out.println("is now come after newDate -->" + isNowAfterNewDate);

    }


    }


