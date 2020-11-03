package pw_6_5;

public abstract class Shape {
    {
        System.out.println("执行shape的初始化块");
    }
    private String color;
    //定义一个计算周长的抽象方法
    public abstract double calPerimeter();
    public abstract String getType();
    //定义shape的构造器，该构造器并不是用于创建shape对象
    //而是用于被子类调用
    public Shape(){}
    public Shape(String color)
    {
        System.out.println("执行shape的构造器");
        this.color = color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }
}
