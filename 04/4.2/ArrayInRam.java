public class ArrayInRam
{
	public static void main(String[] args)
	{
		//���岢��ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a = {5, 7, 20};
		//���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		int[] b = new int[4];
		//���b�ĳ���
		System.out.println("b����ĳ��ȣ�" + b.length);
		//ѭ�����a�����Ԫ��
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		//ѭ�����b����
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		//��Ϊa��int[]�ͣ�bҲ��int[]�ͣ����Կ��Խ�a��ֵ��ֵ��b��
		//Ҳ������b����ָ��a����ָ�������
		b = a;
		//�ٴ����b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
		//�ı�a��Ԫ�ص�ֵ�۲�b����᲻�ᷢ���仯����Ϊa��bָ��ͬһ������������
		//b��ԭ��ָ��������û�����ñ���ָ�����ˣ����������ڴ棬�ȴ����ա�
		a[0] = 555;
		System.out.println("�޸�a[0]ΪԪ��555֮��b[0]�е�Ԫ��Ϊ��" + b[0]);
	}
}