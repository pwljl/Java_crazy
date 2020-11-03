public class TestForEach
{
	public static void main(String[] args)
	{
		String[] books = {"轻量级J2EE企业应用实战", 
		"Structs2权威指南",
		"基于J2EE的Ajax宝典"};
		//使用foreach循环来遍历数组元素，其中book将会自动迭代每个数组元素
		for (String book : books)
		{
			System.out.println(book);
		}
	}
}