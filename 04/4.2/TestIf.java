public class TestIf
{
	public static void main(String[] args)
	{
		int age = 30;
		if (age > 20)
		//只有当age > 20时下面花括号括起来的语句块才会执行
		//花括号括起来的语句是一个整体，要么一起执行，要么一起不执行
		{
			System.out.println("年龄已经大于二十岁了");
			System.out.println("20岁以上的人应该学会承担责任了");
		}
	}
}