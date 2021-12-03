package Repo_Java1.Repo_Java1;

class Person {
    private String name;
    private int age;
    private int birth;

    /*this变量
    在方法内部，可以使用一个隐含的变量this，它始终指向当前实例。
    因此，通过this.field就可以访问当前实例的字段。
    如果没有命名冲突，可以省略this。例如：
    */
    public String getName() {
        return name;
    }
    /* 但是，如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this：
    */
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }
    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    public void setNameAndAge(String name, int age){

    }
        public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("Xiao Ming");
        ming.setAge(12);
        ming.setBirth(2008);
        System.out.println(ming.getName() + ", " + ming.getAge());

            Person p = new Person();
            int n = 15;
            p.setAge(n);
            System.out.println(p.getAge());

    }
/*同样，外部代码不能直接读取private字段，但可以通过getName()和getAge()间接获取private字段的值。

所以，一个类通过定义方法，就可以给外部代码暴露一些操作的接口，同时，内部自己保证逻辑一致性。

调用方法的语法是实例变量.方法名(参数);。一个方法调用就是一个语句，所以不要忘了在末尾加;。例如：ming.setName("Xiao Ming");。

定义方法
从上面的代码可以看出，定义方法的语法是：

修饰符 方法返回类型 方法名(方法参数列表) {
    若干方法语句;
    return 方法返回值;
}
方法返回值通过return语句实现，如果没有返回值，返回类型设置为void，可以省略return。
*/
}
class Group{
    private String[] names;
    public void setNames(String...names){
        this.names = names;
    }
// variable parameters:
    public static void main(String[] args) {
        Group g = new Group();
        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun");// 传入3个String
        g.setNames("Xiao Ming", "Xiao Hong"); // 传入2个String


    }
 /*
 or you can convert variable parameters to String type;
 class Group {
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }
}
 */

}

