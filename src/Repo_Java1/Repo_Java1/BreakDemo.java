package Repo_Java1.Repo_Java1;

import java.util.Arrays;

public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int searchFor = 12;
        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " not in the array");
        }
        /*This program searches for the number 12 in an array. The break statement, shown in boldface, terminates
         * the for loop when that value is found. Control flow then transfers to the statement after the for loop.
         * This program's out is: Found 12 at index 4
         * */

        // arrange sequence of numbers array: reverse int numbers array
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i2 = 0; i2 < ns.length - 1; i2++) {
            for (int j = 0; j < ns.length - 1 - i2; j++) {
                if (ns[j] > ns[j + 1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
        // 冒泡排序后:
        System.out.println(Arrays.toString(ns));
        /*
        冒泡排序的特点是，每一轮循环后，最大的一个数被交换到末尾，因此，
        下一轮循环就可以“刨除”最后的数，每一轮循环都比上一轮循环的结束位置靠前一位。
        另外，注意到交换两个变量的值必须借助一个临时变量。像这么写是错误的：
            int x = 1;
            int y = 2;
            x = y; // x现在是2
            y = x; // y现在还是2
            正确的写法是：
            int x = 1;
            int y = 2;
            int temp = x; // 把x的值保存在临时变量temp中, temp现在是1
            x = y; // x现在是2
            y = temp; // y 现在是temp的值--1
            * 实际上，Java的标准库已经内置了排序功能，
            * 我们只需要调用JDK提供的Arrays.sort()就可以排序：
            * reverse a number array using Arrays.sort()
            */
        int[] numArray = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        Arrays.sort(numArray);
        System.out.println("isn't it simple? " + Arrays.toString(numArray));

        /*
        * 必须注意，对数组排序实际上修改了数组本身。例如，排序前的数组是：

        int[] ns = { 9, 3, 6, 5 };
        在内存中，这个整型数组表示如下：

              ┌───┬───┬───┬───┐
        ns───>│ 9 │ 3 │ 6 │ 5 │
              └───┴───┴───┴───┘
        当我们调用Arrays.sort(ns);后，这个整型数组在内存中变为：
              ┌───┬───┬───┬───┐
        ns───>│ 3 │ 5 │ 6 │ 9 │
              └───┴───┴───┴───┘
        即变量ns指向的数组内容已经被改变了。
        如果对一个字符串数组进行排序，例如：
        * String[] ns = { "banana", "apple", "pear" };
        排序前，这个数组在内存中表示如下：

                   ┌──────────────────────────────────┐
               ┌───┼──────────────────────┐           │
               │   │                      ▼           ▼
         ┌───┬─┴─┬─┴─┬───┬────────┬───┬───────┬───┬──────┬───┐
ns ─────>│░░░│░░░│░░░│   │"banana"│   │"apple"│   │"pear"│   │
         └─┬─┴───┴───┴───┴────────┴───┴───────┴───┴──────┴───┘
           │                 ▲
           └─────────────────┘
    调用Arrays.sort(ns);排序后，这个数组在内存中表示如下：

                   ┌──────────────────────────────────┐
               ┌───┼──────────┐                       │
               │   │          ▼                       ▼
         ┌───┬─┴─┬─┴─┬───┬────────┬───┬───────┬───┬──────┬───┐
ns ─────>│░░░│░░░│░░░│   │"banana"│   │"apple"│   │"pear"│   │
         └─┬─┴───┴───┴───┴────────┴───┴───────┴───┴──────┴───┘
           │                              ▲
           └──────────────────────────────┘
        原来的3个字符串在内存中均没有任何变化，但是ns数组的每个元素指向变化了。
  */
        // descending order:
        int[] numbArray = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        // 排序前:
        System.out.println("before: " + Arrays.toString(numbArray));
        for (int i3 = 0; i3 < numbArray.length - 1; i3++) {
            for (int j1 = 0; j1 < numbArray.length - 1 - i3; j1++) {
                if (numbArray[j1] < numbArray[j1 + 1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = numbArray[j1];
                    numbArray[j1] = numbArray[j1 + 1];
                    numbArray[j1 + 1] = tmp;
                    if (Arrays.toString(numbArray).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
                        System.out.println("测试成功");
                    } else {
                        System.out.println("测试失败");
                    }
                }
            }
        }
        // 排序后:
        System.out.println("After: " + Arrays.toString(numbArray));
    }
}

