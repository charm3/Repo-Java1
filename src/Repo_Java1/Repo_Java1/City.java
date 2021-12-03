package Repo_Java1.Repo_Java1;

public class City {
    String name; double latitude; double longitude;

    public static void main(String[]  args) {
        /*请定义一个City类，该class具有如下字段:

name: 名称，String类型
latitude: 纬度，double类型
longitude: 经度，double类型
实例化几个City并赋值，然后打印。
*/
// City

        City bj = new City();

        bj.name = "Beijing";
    bj.latitude = 39.903;
    bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);

        City tj = new City();
        tj.name = "Tianjin";
        tj.latitude = 24.841;
        tj.longitude = 132.369;
        System.out.println(tj.name);
        System.out.println("location: " + tj.latitude + ", " + tj.longitude );

        }

}



