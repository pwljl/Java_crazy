package pw_6_7;

interface Product1
{
    double getPrice();
    String getName();
}
public class AnonymousTest1 implements Product1
{
    public void test(Product1 p)
    {
        System.out.println("购买了一个" + p.getName() + ", 花掉了" + p.getPrice());
    }
    public String getName()
    {
        return "AGP显卡";
    }
    public double getPrice()
    {
        return 567.8;
    }

    public static void main(String[] args)
    {
        var ta = new AnonymousTest1();
        ta.test(new AnonymousTest1());
    }
}
