public class TestWhile
{
	public static void main(String[] args)
	{
		//ѭ���ĳ�ʼ����
		int count = 0;
		int a;
		//��countС��10ʱ��ִ��ѭ����
		while (count < 10)
		{
			System.out.println(count);
			//�������
			a = count++;
			System.out.println("�������count��" + count);
			System.out.println("�������count++��" + a);
		}
	}
}