public class TestReferenceArray
{
	public static void main(String[] args)
	{
		//����һ��students�����������������Person[]
		Person[] students;
		//ִ�ж�̬��ʼ��
		students = new Person[2];
		//����һ��Personʵ�����������Personʵ����ֵ��zhang����
		Person zhang = new Person();
		//Ϊzhang�����õ�Person��������Ը�ֵ
		zhang.age = 15;
		zhang.height = 158;
		//����һ��Personʵ�����������Personʵ������lee����
		Person lee = new Person();
		//Ϊlee�����õ�Person��������Ը�ֵ
		lee.age = 16;
		lee.height = 161;
		//��zhang������ֵ������һ������Ԫ��
		students[0] = zhang;
		//��lee������ֵ�����ڶ�������Ԫ��
		students[1] = lee;
		//�������еĽ����ȫһ������Ϊlee��students[1]ָ�����ͬһ��Personʵ��
		lee.info();
		students[1].info();
	}
}