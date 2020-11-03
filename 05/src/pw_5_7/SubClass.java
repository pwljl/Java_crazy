package pw_5_7;

class BaseClass
{
    public int book = 6;
    public void base()
    {
        System.out.println("父类的普通方法");
    }
    public void test()
    {
        System.out.println("父类中被覆盖的方法");
    }
}

public class SubClass extends BaseClass {
    //重新定义一个book实例变量隐藏父类的book实例变量
    public String book = "轻量级Java EE企业应用实战";
    public void test()
    {
        System.out.println("子类覆盖父类的方法");
    }

    public void sub()
    {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args)
    {
        //编译类型和运行类型一致，不存在多态
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        //编译类型和运行类型一致，不存在多态
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.sub();
        sc.test();

        //编译类型和运行类型不一致，多态发生
        BaseClass ploymophicBc = new SubClass();
        //输出6，表明访问的是父类的实例变量，实例变量永远都访问编译时的类型
        System.out.println(ploymophicBc.book);
        //调用父类继承到的base()方法，因为子类中没有这个方法
        ploymophicBc.base();
        //调用子类中的test()方法，因为子类中的test方法已经将父类中的覆盖了，注意在运行时访问的时运行时类型的方法
        ploymophicBc.test();
        //父类中，也就是编译时那个类型中没有定义这个sub()方法，在编译时没有编译到这个方法
        //ploymophicBc.sub()
    }
}
