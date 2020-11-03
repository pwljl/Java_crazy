package pw.demo;

public class StaticAccessNonStatic {
    public void info()
    {
        System.out.println("简单得info方法");
    }

    public void ob()
    {
        info();
    }

    public static void main(String[] args)
    {
        new StaticAccessNonStatic().info();
        if (true)
    {
            int i = 0;
            System.out.println("代码块内的i：" + i);
    }
        System.out.println("代码块外的i：" );
    }
}
