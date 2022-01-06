package Repo_Java1.Repo_Java1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class Hmk11 {
    public static void main(String[] args) {
       /* final Timeline timeline = new Timeline();
        timeline.setCycleCount(2);
        timeline.setAutoReverse(true);
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(5000),
                new KeyValue (node.translateXProperty(), 25)));
        timeline.play();

        */
        /**
         *
         * Due Date: Wed, Dec 15 2021
         *
         * Try to submit code by creating a merge request.
         *
         * Create a method that will return a timeline of given input data-points
         * -> timeline should be (hour am/pm) with 2 hour interval from the current time.
         *
         *
         * generateTimeline(5)
         * // 8pm 10pm 12am 2am 4am
         *
         * generateTimeline(7)  // if running code at 3:12pm
         * // 3pm 5pm 7pm 9pm 11pm 1am 3am
         *
         * generateTimeline(10)     // running code at 2:45am
         * // 2am 4am 6am 8am 10am 12pm 2pm 4pm 6pm 8pm
         *
         */

        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("ha");
        String myTime = df.format(now);
        System.out.println(myTime);

        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.HOUR, 2);

       //cal.add(Calendar.HOUR, 8);
       //cal.add(Calendar.HOUR, 10);
        Date addedTime = cal.getTime();
        SimpleDateFormat formatTime = new SimpleDateFormat("ha");
        String changedTime = formatTime.format(addedTime);
        System.out.println(changedTime);
        cal.add(Calendar.HOUR, 2);

        System.out.println(changedTime);



    }
}









