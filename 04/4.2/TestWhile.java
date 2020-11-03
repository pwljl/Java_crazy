public class TestWhile
{
	public static void main(String[] args)
	{
		//循环的初始条件
		int count = 0;
		int a;
		//当count小于10时，执行循环体
		while (count < 10)
		{
			System.out.println(count);
			//迭代语句
			a = count++;
			System.out.println("迭代后的count：" + count);
			System.out.println("迭代后的count++：" + a);
		}
	}
}