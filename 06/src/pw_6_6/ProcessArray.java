package pw_6_6;

public class ProcessArray
{
    public void process(int[] target, Command cmd)
    {
        for (var t : target)
        {
            cmd.process(t);
        }
    }
}
