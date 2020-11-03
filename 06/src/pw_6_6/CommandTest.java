package pw_6_6;

public class CommandTest
{
    public static void main(String[] args)
    {
        var pa = new ProcessArray();
        int[] target = {3, 4, 5, 6};
        //第一次处理数组，具体行为取决于PrintCommand
        pa.process(target, new PrintCommand());
        System.out.println("\n");
        //第一次处理数组，具体行为取决于SquareCommand
        pa.process(target, new SquareCommand());
    }
}
