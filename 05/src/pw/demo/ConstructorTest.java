package pw.demo;

public class ConstructorTest {
    public String name;
    public int count;
    //提供自定义的构造器，该构造器包含两个参数
    public ConstructorTest(String name, int count)
    {
        //构造器里的this代表初始化的对象
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args)
    {
        //使用自定义的构造器来创建对象
        //系统将会对该对象执行自定义的初始化
        var tc = new ConstructorTest("疯狂java讲义", 90000);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
