package pw_6_1;

public class Primitive2String {
    public static void main(String[] args)
    {
        var intStr = "123";
        //把一个特定字符转换成int变量，把字符串类型的值转换成基本类型的值一般有两种方法
        var it1 = Integer.parseInt(intStr);
        var it2 = Integer.valueOf(intStr);
        System.out.println(it2);

        var floatStr = "4.56";
        var ft1 = Float.parseFloat(floatStr);
        var ft2 = Float.valueOf(floatStr);
        System.out.println(ft2);
        var ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);
        var dbStr = String.valueOf(3.344);
        System.out.println(dbStr);
        //将一个boolean类型的变量转换成String
        var boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());
    }
}
