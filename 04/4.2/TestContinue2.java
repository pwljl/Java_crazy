public class TestContinue2
{
	public static void main(String[] args)
	{
		//���ѭ��
		outer:
		for (int i = 0; i < 5; i++)
		{
			//�ڲ�ѭ��
			for (int j = 0; j < 3; j++)
			{
				System.out.println("i��ֵΪ��" + i + '\t' + "j��ֵΪ��" + j);
				if (j == 1)
				{
					//����outer��ǩ��ָ����ѭ����
					continue outer;
				}
			}
		}
	}
}