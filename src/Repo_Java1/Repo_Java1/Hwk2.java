package Repo_Java1.Repo_Java1;

public class Hwk2 {
    /*use site www.rapidtables.com to practice operators

     */
    public static void main(String[] args) {
        /* convert Fahrenheit to Celsius
        TC = (TF - 32) * 5/9
        TF = 37 in Richmond, VA now
        TC = 2.78
  */
    double TempF = 37;
    double TempC = (TempF - 32) * 5/9;
    System.out.println(TempF + "°F is equal to " + TempC + "°C");

    /* convert Celsius to Fahrenheit
    T°F = T°C * 9/5 + 32
    T°C = 12 in Beijing, China now
    T°F = 53.6
     */
        double TempCelsius = 12;
        double TempFahrenheit = (TempCelsius * 9/5 + 32);
        System.out.println(TempCelsius + "°C is equal to " + TempFahrenheit + "°F");

        /* convert celsius to Kelvin
        TK = T°C + 273.15
        T°C = 12 in Beijing, China now
        TK = 285.15
         */
        double TempKevin = (TempCelsius + 273.15);
        System.out.println( TempCelsius + "°C is equal to " + TempKevin + "K");

        /* convert Fahrenheit to Kevin
        TK = (T°F + 459.67) * 5/9
        Current temperature in Bangkok TF = 88 Fahrenheit
        Convert to Kevin = 304.26111
         */
        double tFahrenheit = 88;
        double tKevin = (tFahrenheit + 459.67) * 5/9;
        System.out.println(tFahrenheit + "°F is equal to " + tKevin + "K");

        /* convert Kevin to Celsius
        TK = 1000 is current temperature in Venus
        Celsius = TK - 273.15
        Celsius = 726.85
         */
        double KevinT = 1000;
        double CelsiusT = KevinT - 273.15;
        System.out.println( KevinT + "K is equal to " + CelsiusT + "°C");

        /* convert Kevin to Fahrenheit
        current temperature in Mars TK = 187
        T°F = TK * 9/5 - 459.67
        T°F = -123.07
         */
        double KevinMars = 187;
        double FahrenheitMars = KevinMars * 9/5 - 459.67;

        System.out.println(KevinMars + "K is equal to " + FahrenheitMars + "°F" );



    }
}
