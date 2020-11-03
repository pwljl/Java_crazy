package pw_5_6;

class Base
{
    public double size;
    public String name;
    public Base(double size, String name)
    {
        this.size = size;
        this.name = name;
    }
}
public class Sub extends Base
{
    public String color;
    //构造器
    public Sub(double size, String name, String color)
    {
        //通过super调用来调用父类构造器的初始化过程
        //因为java是单继承，所以super后面没有父类名字，因为直接父类只有一个
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args)
    {
        var s = new Sub(5.6, "测试对象", "红色");
        //输出Sub对象的三个实例变量
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }
}
