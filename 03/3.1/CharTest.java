public class CharTest
{
	public static void main(String[] args)
	{
		//ֱ��ָ�������ַ���Ϊ�ַ�ֵ
		char aChar = 'a';
		//ʹ��ת���ַ�����Ϊ�ַ�ֵ
		char enterChar = '\r';
		//ʹ��Unicode����ֵ��ָ���ַ�ֵ
		char ch = '\u9999';
		//�����һ�����㡱��
		System.out.println(ch);
		//����һ������
		char zhong = '��';
		//ֱ�ӽ�char��������int���ͱ�����ʹ��
		int zhongValue = zhong;
		System.out.println(zhongValue);
		//ֱ�Ӱ�һ��0~65535��������һ��char����
		char c = 97;
		System.out.println(c);
	}
}