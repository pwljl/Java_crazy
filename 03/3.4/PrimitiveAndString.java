public class PrimitiveAndString
{
	public static void main(String[] args)
	{
		//5是整数，不能直接赋值给字符串
		//String str1 = 5;
		//基本类型的值与字符串进行连接时，基本类型的值会自动转换成字符串
		String str2 = 3.5f + "";
		//下面输出的3.5其实是字符串类型的
		System.out.println(str2);
		//下面的语句将输出2Hello！
		System.out.println(3 + 4 + "Hello!");
		//下面的语句会输出Hello！34，因为“Hello”会把3当作字符串处理，而后再把4当作字符串处理
		System.out.println("Hello!" + 3 + 4);
	}
}