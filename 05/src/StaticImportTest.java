import static java.lang.System.*;
import static java.lang.Math.*;

public class StaticImportTest {
    public static void main(String[] args)
    {
        //out是java.langl.System类的静态成员变量
        //PI是java.lang.Math类的静态变量，表示pi常量
        out.println(PI);
        //直接调用Math类的sqrt静态方法
        out.println(sqrt(256));
    }
}
