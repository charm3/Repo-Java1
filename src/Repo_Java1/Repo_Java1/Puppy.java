package Repo_Java1.Repo_Java1;

import java.text.DecimalFormat;

public class Puppy {
    public static void main(String[] args) {


        Puppy myPuppy = new Puppy("Jackie");
        int x = 100;
        System.out.println("Jackie is " + x + " years old.");
        double y = 1.0 / 10;
        double z = 1 - 9.0 / 10;
        System.out.println(y);
        System.out.println(z);
        double d = 2.6;
        int n = (int) (d + 0.5);
        System.out.println(n);
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        System.out.println(Math.sqrt(2));

        double r1 = 0;
        double r2 = 0;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "true" : "false");
        // can use "ture" : "false" in printout

        char e = 'A'; // must use ''

        String a1 = "Hello";
        String a2 = "World";
        String a3 = a1 + " " + a2 + "!";
        // you can use + to connect any strings or other data types in a string
        System.out.println(a3);

        int age1 = 25;
        String a4 = "age is " + age1;
        // if use + to connect other value types, will automatically convert to Strings and connect:
        System.out.println(age1);
        System.out.println(a4);

        String a5 = """  
                SELECT * FROM
                users
                WHERE id>100
                ORDER BY name DESC
                """;
        // use """...""" to express multiple lines - text blocks
        System.out.println(a5);

        String a6 = "hello";
        String a7 = a6;
        a6 = "world";
        System.out.println(a7);

        int a8 = 72;
        int a9 = 105;
        int a10 = 65281;
        String a11 = Integer.toString(a10);
        String a12 = Integer.toString(a8);
        String a13 = Integer.toString(a9);
        // convert int value to string
        System.out.println(a11 + ", " + a12 + ", " + a13 + ". ");
        // or
        int number = -1234;
        String str = String.format("%d", number);
        System.out.println("With format method: string = " + str);
        // or
        int a14 = 1235;
        String str1 = String.valueOf(a14);
        System.out.println(str1);
        // or decimal format
        int a15 = 123456;
        DecimalFormat a15Format = new DecimalFormat("##,###.00");
        String a15str = a15Format.format(123456);
        System.out.println("The number to be converted is: " + a15);
        System.out.println("The String version of 123456 is: " + a15str);
        // can also sue StringBuilder/String Buffer, no examples here

        // 5 students' scores:
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 63;
        //must initialize int[], must use new int[5] to express that you created an int array.
        //all default initialization value is 0, integer 0, float 0.0, boolean false.
        // once created an int array, can't change the size
        // to get size, use ns.length --> 5
        // or use the following to initialize in the beginning:
        int[] ns1 = new int[]{68, 79, 91, 85, 63};
        System.out.println(ns.length);
        // or we can simplify as follows:
        int[] ns2 = {68, 79, 91, 85, 63};

        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(names[1]); //--> cat
        System.out.println(s); // -->XYZ

        System.out.print("A,"); //use print if use the same line
        System.out.print("B,"); //use println if start a new line
        System.out.print("C.");
        System.out.println();
        System.out.println("END");

        double a16 = 3.1415926;
        System.out.printf("%.2f\n", a16);  // formatted printout, show 2 digits after .
        System.out.printf("%.4f\n", a16);   // formatted printout, show 4 digits after .
        // use printf for formatted printout

        int a17 = 12345000; //use 0 to fill to 8 digits for 16 system
        System.out.printf("a17=%d, hex=%08x", a17, a17); //two %% you must input two numbers

        /**
         Scanner scanner = new Scanner(System.in); // create Scanner target
         System.out.print("Input your name: "); // out to print
         String name = scanner.nextLine(); // input a string
         System.out.print(" Input your age: ");
         int age = scanner.nextInt(); // input an integer
         System.out.printf("Hi, %s, you are %d\n", name, age);
         */



    }
        public Puppy(String name) {

            System.out.println("Passed Name is: "+name);
        }



    }

