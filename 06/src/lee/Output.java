package lee;

public interface Output {
    //接口里定义的成员变量只能是常量，定义成员变量时，默认使用public static final修饰符
    int MAX_CACHE_LINE = 50;
    //接口里定义的普通方法只能时public的抽象方法, 默认是public abstract
    void out();
    void getData(String msg);
    //在接口中定义的默认方法，需要使用default修饰
    default void print(String... msgs)
    {
        for (var msg : msgs)
        {
            System.out.println(msg);
        }
    }
    //在接口中定义的默认方法，需要使用default修饰
    default void test()
    {
        System.out.println("默认的test()方法");
    }
    //在接口中定义类方法，使用static修饰
    static String staticTest()
    {
        return "接口里的类方法";
    }
    //定义私有方法
    private void foo()
    {
        System.out.println("foo私有方法");
    }
    //定义私有静态方法
    private static void bar()
    {
        System.out.println("bar里的私有方法");
    }

}
