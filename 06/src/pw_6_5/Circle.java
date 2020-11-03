package pw_6_5;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius)
    {
        super(color);
        this.radius = radius;
        //验证形参radius和实例变量在内存中的存储模式
        radius = 10;
        System.out.println("形参radius = " + radius);
        System.out.println("实例变量的radius = " + this.radius);
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getType()
    {
        return getColor() + "圆形";
    }

    public double calPerimeter()
    {
        System.out.println("更改后的radius：" + radius);
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        Shape s1 = new Triangle("黑色", 3, 4, 5);
        Shape s2 = new Circle("黄色", 3);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}
