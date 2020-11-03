package pw_6_6;

public class PrintCommand implements Command
{
    public void process(int element)
    {
        System.out.println("迭代目标的输出：" + element);
    }
}
