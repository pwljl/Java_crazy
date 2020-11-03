package pw_5_8;

class Animal
{
    private void beat()
    {
        System.out.println("心脏跳动....");
    }

    public void breathe()
    {
        beat();
        System.out.println("吸一口气，吐一口气，呼吸中...");
    }
}

class Bird
{
    //将原来的父类组合到原来的子类，作为子类的一个组合成分
    private Animal a;
    public Bird(Animal a)
    {
        this.a = a;
    }
    //重新定义了一个自己的breathe方法
    public void breathe()
    {
        //直接复用Animal提供的breathe()方法来实现Bird的breathe方法
        a.breathe();
    }

    public void fly()
    {
        System.out.println("我在天空自由自在的飞翔...");
    }
}

class Wolf
{
    //将原来的父类组合到原来的子类，作为子类的一个组合成分
    private Animal a;
    public Wolf(Animal a)
    {
        this.a = a;
    }

    public void breathe()
    {
        a.breathe();
    }

    public void run()
    {
        System.out.println("我在陆地上快速奔跑...");
    }
}

public class CompositeTest
{
    public static void main(String[] args)
    {
        //此时需要显示创建被组合的对象
        var a1 = new Animal();
        var b = new Bird(a1);
        b.breathe();
        b.fly();

        var a2 = new Animal();
        var w = new Wolf(a2);
        w.breathe();
        w.run();
    }

}
