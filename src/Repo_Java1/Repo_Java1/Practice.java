package Repo_Java1.Repo_Java1;
import java.util.ArrayList;
import java.util.List;

    public class Practice {
        public static void main(String[] args) {

                List<String> students = new ArrayList<>();      // length=0

                students.add("Happy");          // ["Happy"]
                students.add("grow");           // ["Happy", "grow"]
                students.add("learn");          // ["Happy", "grow", "learn"]
                students.add("peaceful");       // ["Happy", "grow", "learn", "peaceful"]
                students.add("growing habit");  // ["Happy", "grow", "learn", "peaceful", "growing habit"]
                students.add("good morning");   // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning"]
                students.add("lilli vicknov");  // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov"]
                students.add("kilki");          // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov", "kilki"]
                students.add("Raji now");       // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov", "kilki", "Raji now"]
                students.add("jpw");
                students.add("Learning");
                students.add("LEARN");
                students.add("HAPPY");
                students.add("hour happy");
                students.add("Jiab haow");
                students.add("good night");
                students.add("GOOD DAY");       // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]

                System.out.println("\nStudents -> " + students);                            // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]
                System.out.println("Students ArrayList Length -> " + students.size());      // 17


                String valueToRemove = "Grow";

                /**
                 * Remove the value from students-ArrayList (ignore cases)
                 * Hint:
                 *      remove-method using index
                 *      normal-for-loop
                 *      if
                 *      get-method
                 *      equalsIgnoreCases
                 *
                 */

            System.out.println("original students list: " + students);
                String getValue1 = students.get(1);
            System.out.println("what is getValue1: " + getValue1);

           for (int i = 0; i<=students.size()-1; i++) {
                        if (getValue1.equalsIgnoreCase("Grow")) {
                            students.remove(getValue1);
                        }
                }
            System.out.println("Grow is removed " + students);
            System.out.println(students.size());

            List <String> newStudents = new ArrayList<>();










            }
        }



