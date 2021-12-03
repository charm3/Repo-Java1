package Repo_Java1.Repo_Java1;

import javax.naming.InterruptedNamingException;
import javax.naming.directory.InvalidAttributeIdentifierException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    // Due date: Dec-03
    Scanner input1 = new Scanner(System.in);
    // Properties
    private String name;
    private int age;
    private String state;
    private String courseName;
    private int yourStudentId;
    private static int studentId = 0;
    private String[] courseNames = {"QA", "PM", "BA", "Developer"};
    private Scanner input = new Scanner(System.in);

    /*
        method to enroll

        1. what is the purpose of method - to enroll a student
        2. make user of scanner class to make student interactive enrollment flow interactive
            Mandatory fields (name, age, courseName)
            Optional fields (state) ; default state value: "--"
        3. should I return any value in the end of method? - no, void

        Requirement:
            no student below 16 should be able to enroll
            no student should be able to enroll if courseName is other than "QA, PM, BA, Developer"

        Note: Handle relevant exceptions

    */
    public void enroll() {
        System.out.println("Please enter your age in years:");

        int sAge = input.nextInt();
        try {
            if (sAge < 16) {
                System.out.println("Sorry, you are under age.");
            } else {
                boolean isCourseValid = false;
                System.out.println("Please enter the course in which you want to enroll:");
                String sCourseName = input.next();
                for (String cName : courseNames) {
                    if (cName.equalsIgnoreCase(sCourseName)) {
                        isCourseValid = true;
                        System.out.println("Please enter your name:");
                        name = input.next();
                        age = sAge;
                        System.out.println("Please enter your state:");
                        state = input.next();
                        courseName = sCourseName;
                        yourStudentId = ++studentId;
                        break;
                    }
                }
                if (isCourseValid) {
                    System.out.println("\n\nHey, thank you " + name + " for the enrollment\nYour student-id: " + yourStudentId);
                } else {
                    System.out.println("\n\nIncorrect course name provided.\nProvided course name: " + sCourseName + "\nValid course names: " + Arrays.toString(courseNames));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" under 16 is throwing input exception");
        }
     /*
        changeState
        make user of scanner class to make change state flow interactive
        return type - No

        Requirement:
            New state name should NOT be same as already in the system.
            If student enters new state same as the already registered one, show relevant error msg

        Note: Handle relevant exceptions
     */
        try {
            String changeState = input.next();
            String newState = input.next(state);

        } catch (IllegalStateException e) {
            System.out.println(" non-US state name is entered");
        }
    /*
        changeName
        make user of scanner class to make change name flow
        return type - No

        Requirement:
            New name should NOT be same as already in the system.
            If student enters newName same as the already registered one, show relevant error msg

        Note: Handle relevant exceptions
     */

        String newName = input.next(name);
        try {
            if (name.equalsIgnoreCase(newName)) {
                System.out.println("This name is already registered");
            } else {
                name = newName;
                System.out.println("Name changed successfully");
            }
        } catch (InputMismatchException name) {
            System.out.println(" name already registered exception");
        }


    /*
    showDetailSummary
    make user of scanner class to make show student details flow interactive
    return type - No

    show should be able to see details if correct id provided

    Note: Handle relevant exceptions

 */
        String showDetailSummary;
        System.out.println("\nTo see detail summary, please enter the id: ");
        int id = input.nextInt();
        try {
            if (id == yourStudentId) {
                System.out.println("\n**** Detail Student summary: ***\nName : " + name +
                        "\nStudent id : " + yourStudentId +
                        "\nAge : " + age +
                        "\nState : " + state +
                        "\nCourse name : " + courseName);
            } else {
                System.out.println("Please enter your correct id value. Incorrect id entered: " + id);
            }
        } catch (InputMismatchException e) {
            System.out.println(" wrong student id");
        }

    }



}

