package pw_5_6;

//父类
class Creature
{
    public Creature()
    {
        //没有this和super的话会隐式的调用父类无参数的构造器
        System.out.println("Creature无参数的构造器");
    }
}

//亚子类
class Animal extends Creature
{
    public Animal(String name)
    {
        System.out.println("Animal带一个参数的构造器，" + "其name为" + name);
    }
    public Animal(String name, double age)
    {
        //使用this调用同一个重载的构造器
        this(name);
        System.out.println("Animal带两个参数的构造器，" + "其age为" + age);
    }
}

//子类
public class Wolf extends Animal
{
    public Wolf()
    {
        //显示的调用父类中有两个参数的构造器
        super("灰太狼", 3);
        System.out.println("Wolf无参数构造器");
    }
    public static void main(String[] args)
    {
        new Wolf();
    }
}
