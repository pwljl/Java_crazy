package pw_6_2;

class Apple
{
    private String color;
    private double weight;
    public Apple()
    {}
    //提供有参数的构造器
    public Apple(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }
    //重写ToString()方法，用于实现Apple对象的自我描述
    public String toString()
    {
        return "一个苹果，颜色是" + this.color + "，重量是" + this.weight;
    }

}

public class ToStringTest {
    public static void main(String[] args)
    {
        var a = new Apple("红色", 5.68);
        //打印Apple对象
        System.out.println(a);
        System.out.println(a.toString());
    }
}
