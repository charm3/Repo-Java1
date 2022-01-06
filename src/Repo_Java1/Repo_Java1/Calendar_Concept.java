package Repo_Java1.Repo_Java1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Concept {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        /*
        * to create Date-Object using Calendar-instance/object
        * Method: getTime()
        * return type: Date
        * */
        Date fromCal = cal.getTime();
        System.out.println("\nDate using Calendar-instance --> " + fromCal);

        /*to create calendar instance using date-object
        * method: setTime()
        * */
        Date newDate = new Date("1/1/22 9:15:22 am");
        cal.setTime(newDate);
        System.out.println(cal);

        cal.add(Calendar.DATE, 65);
        cal.add(Calendar.YEAR, 10);
        cal.add(Calendar.MONTH, -2);
        // get date from the Calendar instance
        Date changedDate = cal.getTime();
        System.out.println(changedDate);

        /* Print the checkin and checkout date in format like: Jan, 01 2022
        * Checkin date: current date
        * checkout date: 7 days from the checkin
        * */
        Date currentDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMM, dd yyyy");
        String checkinDate = df.format(currentDate);
        System.out.println("\n\nCheckin Date: " + checkinDate);

        Calendar myCal = Calendar.getInstance();
        myCal.setTime(currentDate);
        myCal.add(Calendar.DAY_OF_MONTH, 7);
        Date checkoutDateObject = myCal.getTime();
        String checkoutDate = df.format(checkoutDateObject);
        System.out.println("Checkout Date: " + checkoutDate);


    }
}
