package pw.demo;

public class Apple {
    public String name;
    public String color;
    public double weight;
    //没有参数的构造器
    public Apple(){}
    //两个参数的构造器
    public Apple(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    //三个参数的构造器
    public Apple(String name, String color, double weight)
    {
        //通过this调用另一个构造器
        this(name, color);
        this.weight = weight;

    }

    public static void main(String[] args)
    {
        var ap = new Apple("彭w", "black", 69);
        System.out.println(ap.name + '\n' + ap.color + '\n' + ap.weight);
    }
}
