public class TestDoWhile
{
	public static void main(String[] args)
	{
		//定义变量count
		int count = 1;
		//执行do while循环
		do
		{
			System.out.println(count);
			count++;
		}
		//循环条件紧跟while关键字
		while(count < 10);
		System.out.println("循环结束！");
	}
}