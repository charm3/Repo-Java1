package Repo_Java1.Repo_Java1;

public class Hwk1 {
    /* make 8 variables
    number of hours in a day


     */
    public static void main(String[] args) {
        byte hours_a_day = 24;
        System.out.println("total number of hours a day is " +  hours_a_day);
    /* maximum number of days in a year

     */
        short maximum_number_of_days_in_a_year = 366;
        System.out.println("maximum number of days in a year is " + maximum_number_of_days_in_a_year);
    /* total number of employees in Altria

     */
        int number_of_employees_in_Altria = 9000;
        System.out.println("total number of employees in Altria Corporation is " + number_of_employees_in_Altria);
    /* population in a country

     */
       long population_in_China = 1402000000;
       System.out.println("2021 population in China is " + population_in_China);

    /* Mortgage rate current

     */
        float mortgage_rate = 2.9f;
        char percentage = '%';
        System.out.println("\nMortgage rate is " + mortgage_rate + percentage );
    /* Balance in a bank account

     */
        double bank_account_balance = -465.75;
        System.out.println("Charmaine's bank account balance is $ " + bank_account_balance);
    /* Does the sun rise from the west

        */
        boolean sun_from_west = false;
        System.out.println("Does the sun rise from the west? = " + false);
    /* Initials of your  name

     */
        char nameInitials1 = 'L';
        char nameInitials2 = 'L';
        char nameInitials3 = 'C';

        System.out.println("Charmaine's name initials is = " +nameInitials1 + nameInitials2 + nameInitials3);

        String myFirstName = "Ling ";
        myFirstName = myFirstName + "Chen";
        System.out.println(myFirstName);

        int age = 16;
        int age1 = 18;
        age++;
        System.out.println("age is " + age); //17
        System.out.println("age again is " + age++); // 17 but internal count is 18
        System.out.println("age again again is " + age); //18
        boolean trueOrFalse1 = age++ < --age1; // 18 < 17, internal count is 19
        System.out.println(trueOrFalse1); // 18 < 17, false
        System.out.println(age + " " + age1); // 19, 17
        age--;
        ++age1;
        System.out.println("now age is  " + age);
        System.out.println("now age1 is " + age1);
        boolean trueOrFalse2 = age == age1;
        System.out.println(trueOrFalse2);










    }
}
