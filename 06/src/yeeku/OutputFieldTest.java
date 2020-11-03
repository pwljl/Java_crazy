package yeeku;

import lee.Output;

public class OutputFieldTest {
    public static void main(String[] args)
    {
        System.out.println(Output.MAX_CACHE_LINE);
        //下面语句将会引发final变量赋值编译异常
//        Output.MAX_CACHE_LINE = 20;
        System.out.println(lee.Output.staticTest());
    }
}
