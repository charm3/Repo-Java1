package Repo_Java1.Repo_Java1;

class Person1 {
    private String name1;
    private int age1;
    public int getAge1() {
        return this.age1;
    }
    public void setAge1(int age1) {
        this.age1 = age1;
    }
/*参数绑定
调用方把参数传递给实例方法时，调用时传递的值会按参数位置一一绑定。

那什么是参数绑定？

我们先观察一个基本类型参数的传递：*/
    public static void main(String[] args) {
        Person1 p = new Person1();
        int n = 15;
        p.setAge1(n);
        System.out.println(p.getAge1());
        n = 20;
        System.out.println(p.getAge1());
  /*运行代码，从结果可知，修改外部的局部变量n，不影响实例p的age字段，原因是setAge()方法获得的参数，复制了n的值，因此，p.age和局部变量n互不影响。

结论：基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响。

我们再看一个传递引用参数的例子：
*/

    }

}
