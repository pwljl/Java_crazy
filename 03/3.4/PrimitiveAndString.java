public class PrimitiveAndString
{
	public static void main(String[] args)
	{
		//5������������ֱ�Ӹ�ֵ���ַ���
		//String str1 = 5;
		//�������͵�ֵ���ַ�����������ʱ���������͵�ֵ���Զ�ת�����ַ���
		String str2 = 3.5f + "";
		//���������3.5��ʵ���ַ������͵�
		System.out.println(str2);
		//�������佫���2Hello��
		System.out.println(3 + 4 + "Hello!");
		//������������Hello��34����Ϊ��Hello�����3�����ַ������������ٰ�4�����ַ�������
		System.out.println("Hello!" + 3 + 4);
	}
}