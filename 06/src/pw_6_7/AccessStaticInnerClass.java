package pw_6_7;

public class AccessStaticInnerClass
{
    static class StaticInnerClass
    {
        private static int prop1 = 5;
        private int prop2 = 9;
    }

    public void accessInnerProp()
    {
        //类成员
        System.out.println(StaticInnerClass.prop1);
        //访问实例成员
        System.out.println(new StaticInnerClass().prop2);
    }
}
