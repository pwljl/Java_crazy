public class TestMath
{
	public static void main(String[] args)
	{
		double a = 3.2;
		//求a的五次方，并将结果赋值给b
		double b = Math.pow(a, 5);
		//输出b的值
		System.out.println(b);
		//求a的平方根，并将值赋值给c
		double c = Math.sqrt(a);
		//输出C的值
		System.out.println(c);
		//计算随机数，返回一个0~1之间的伪随机数
		double d = Math.random();
		//输出d的值
		System.out.println(d);
		//求1.57的sin函数值：1.57被当作弧度数
		double e = Math.sin(1.57);
		//输出接近于1
		System.out.println(e);
	}
}