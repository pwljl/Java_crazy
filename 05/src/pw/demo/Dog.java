package pw.demo;

public class Dog {
    //定义一个Jump()方法
    public void jump()
    {
        System.out.println("正在执行jump方法");
    }
    //定义一个run方法，通过run方法调用jump方法
    public void run()
    {
        //使用this调用
        this.jump();
        System.out.println("正在执行run方法");
    }
}
