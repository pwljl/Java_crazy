public class TestForEach
{
	public static void main(String[] args)
	{
		String[] books = {"������J2EE��ҵӦ��ʵս", 
		"Structs2Ȩ��ָ��",
		"����J2EE��Ajax����"};
		//ʹ��foreachѭ������������Ԫ�أ�����book�����Զ�����ÿ������Ԫ��
		for (String book : books)
		{
			System.out.println(book);
		}
	}
}