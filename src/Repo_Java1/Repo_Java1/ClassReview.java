package Repo_Java1.Repo_Java1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClassReview {
    public static void main(String[] args) {
        int result = 1 + 2;
        // result is now 3
        System.out.println(("1 + 2 = " + result));
        int originalResult = result;

        result = result - 1;
        //result is now 2
        System.out.println(originalResult + "-1 = " + result);

        result = result * 2;
        // result is now 4
        System.out.println(originalResult + " * 2 = " + result);

        result = result / 2;
        // result is now 2
        System.out.println(originalResult + " /2 = " + result);

        result = result + 8;
        // result is now 10
        System.out.println(originalResult + " + 8 = " + result);

        result = result % 7;
        //result is now 3
        System.out.println(originalResult + " % 7 = " + result);

        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        /* Print the letters from array as below:
        Letter at index-0: a
        Letter at index-1: b
        Letter at index-2: c
        ...
        Letter at index-0: Letters[0]
        Letter at index-1: Letters[1]
        Letter at index-i: Letters[i] // i=0,1,2,...lastIndex
         */

        for (int k = 0; k <= letters.length - 1; k++) {
            System.out.println(" Letter at index - " + k + " : " + letters[k]);
        }

        int w = 0;
        while (w <= letters.length - 1) {
            System.out.println(" Letter at index-" + w + " : " + letters[w]);
            w++;
        }
        int d = 0;
        do {
            System.out.println(" Letter at index -" + d + " : " + letters[d]);
            d++;
        } while (d <= letters.length - 1);

        //for loop, if i is outside for loop, still ok
        int[] ns = {1, 4, 9, 16, 25};
        int i;
        for (i = 0; i < ns.length; i++) {
            System.out.println(ns[i]); //result: 1,4,9,16,25

        }
        // for each loop

        int[] ns1 = {1, 4, 9, 16, 25};
        for (int n : ns1) {
            System.out.println(n); //result: 1,4,9,16,25
        }

        // reverse an int array:
        int[] ns2 = {1, 4, 9, 16, 25};

        for (int j = ns2.length - 1; j >= 0; j--) {
            System.out.println(ns2[j]);
        }

        // calculate pi

        double x = Math.PI;
        System.out.println(x);

// visit every number, for loop  遍历数组
        int[] ns4 = {1, 4, 9, 16, 25};
        for (int l = 0; l < ns4.length; l++) {
            int m = ns4[l];
            System.out.println(m);
        }

        // use for each loop:
        int[] ns5 = {1, 4, 9, 16, 25};
        for (int m1 : ns5) {
            System.out.println("use for each loop: " + m1);

        }
        /*注意：在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引。
        显然for each循环更加简洁。但是，for each循环无法拿到数组的索引，
        因此，到底用哪一种for循环，取决于我们的需要。*/
        int[] ns6 = {2, 6, 9, 7, 4, 1};
        for (int m2 : ns6) {
            System.out.println(ns6); //直接打印数组变量，得到的是数组在JVM中的引用地址：类似 [I@7852e922
        }

        int[] ns7 = {2, 6, 9, 7, 4, 3};
        for (int m3 : ns7) {
            System.out.println(m3 + ", ");
        }

        //使用for each循环打印也很麻烦。幸好Java标准库提供了Arrays.toString()，可以快速打印数组内容：

        int[] ns8 = {2, 6, 9, 7, 4, 3};
        System.out.println(Arrays.toString(ns8));

        //无论是while循环还是for循环，有两个特别的语句可以使用，就是break语句和continue语句。
        // 在循环过程中，可以使用break语句跳出当前循环。我们来看一个例子：

        int sum2 = 0;  //add up 1 to 100
        for (int n = 0; ; n++) {
            sum2 = sum2 + n;
            if (n == 100) {
                break;
            }
        }
        System.out.println(sum2);

        /* 使用for循环计算从1到100时，我们并没有在for()中设置循环退出的检测条件。
        但是，在循环内部，我们用if判断，如果i==100，就通过break退出循环。
        因此，break语句通常都是配合if语句使用。要特别注意，
        break语句总是跳出自己所在的那一层循环。例如：
        */
        for (int ii = 1; ii <= 10; ii++) {
            System.out.println("ii = " + ii);
            for (int jj = 1; jj <= 10; jj++) {
                System.out.println("jj = " + jj);
                if (jj >= ii) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("breaked");
            /*
            * 上面的代码是两个for循环嵌套。因为break语句位于内层的for循环，
            * 因此，它会跳出内层for循环，但不会跳出外层for循环。
            * */
            // use of   CONTINUE
            /*
            break会跳出当前循环，也就是整个循环都不会执行了。
            而continue则是提前结束本次循环，直接继续执行下次循环。
            我们看一个例子：
            */
            int sum3 = 0;
            for (int i2 = 1; i2 <= 10; i2++) {
                System.out.println("begin i2 = " + i2);
                if (i2 % 2 == 0) {
                    continue; // continue语句会结束本次循环
                }
                sum3 = sum3 + i2;
                System.out.println("end i2 = " + i2);
            }
            System.out.println(" here is sum3: " + sum3); // 25
            /*
            注意观察continue语句的效果。当i为奇数时，完整地执行了整个循环，因此，
            会打印begin i=1和end i=1。在i为偶数时，continue语句会提前结束本次循环，
            因此，会打印begin i=2但不会打印end i = 2。
            在多层嵌套的循环中，continue语句同样是结束本次自己所在的循环。
            小结
            break语句可以跳出当前循环；
            break语句通常配合if，在满足条件时提前结束整个循环；
            break语句总是跳出最近的一层循环；
            continue语句可以提前结束本次循环；
            continue语句通常配合if，在满足条件时提前结束本次循环。
            */
            }
    }
}










