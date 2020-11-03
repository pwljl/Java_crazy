import java.util.*;

public class Num2Rmb
{
	private String[] hanArr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
	private String[] unitArr = {"ʰ", "��", "Ǫ"};
	/**
	*��һ���������ֽ��������С�������ַ���
	*@param num ��Ҫ���ֽ�ĸ�����
	*@return �ֽ�������������ֺ�С�����֡���һ������Ԫ�����������֣��ڶ�������Ԫ����С������
	*/
	private String[] divide(double num)
	{
		//��һ��������ǿ������ת��Ϊlong�����õ�������������
		long zheng = (long)num;
		//��������ȥ�������֣��õ�С�����֣�С�����ֳ���100����ȡ���õ���λС��
		long xiao = Math.round((num - zheng) * 100);
		//���������ַ���������ת��Ϊ�ַ���
		return new String[]{zheng + "", String.valueOf(xiao)};
	}
	
	/**
	*��һ����λ�������ַ�����ɺ����ַ���
	*@param numStr ��Ҫ��ת������λ�����ַ���
	*@return ��λ�������ַ�����ת���ɺ����ַ���
	*/
	private String toHanStr(String numStr)
	{
		String result = "";
		int numLen = numStr.length();
		for (int i = 0; i < numLen; i++)
		{
			//��char�����ֻ���int�����֣���Ϊ���ǵ�ASCII��ֵǡ�����48
			//��˰�char�����ּ�ȥ48�õ�int�����֣�����'4'��ת����4
			int num = numStr.charAt(i) - 48;
			//����������һλ���֣��������ֲ����㣬����Ҫ���ӵ�λ��Ǫ���ۣ�ʰ��
			if (i != numLen - 1 && num != 0)
			{
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}
			//����Ҫ���ӵ�λ
			else 
			{
				result += hanArr[num];
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Num2Rmb nr = new Num2Rmb();
		//���԰�һ���������ֽ��������С������
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
		//���԰�һ����λ���������ַ�����ɺ����ַ�
		System.out.println(nr.toHanStr("6109"));
	}
}