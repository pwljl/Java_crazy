package pw.demo;

public class VariableOverrideTest {
    private String name = "李刚";
    private static double price = 78.0;

    public static void main(String[] args)
    {
        var price = 65;
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }

    public void info()
    {
        //方法里的局部变量，局部变量覆盖成员变量
        var name = "孙悟空";
        //直接访问name变量，将输出name局部变量的值为：孙悟空
        System.out.println(name);
        //用this访问name变量，将输出实例变量的值：李刚
        System.out.println(this.name);
    }
}
