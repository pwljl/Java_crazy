public class ArrayInRam
{
	public static void main(String[] args)
	{
		//定义并初始化数组，使用静态初始化
		int[] a = {5, 7, 20};
		//定义并初始化数组，使用动态初始化
		int[] b = new int[4];
		//输出b的长度
		System.out.println("b数组的长度：" + b.length);
		//循环输出a数组的元素
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		//循环输出b数组
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		//因为a是int[]型，b也是int[]型，所以可以将a的值赋值给b。
		//也就是让b引用指向a引用指向的数组
		b = a;
		//再次输出b数组的长度
		System.out.println("b数组的长度为：" + b.length);
		//改变a中元素的值观察b数组会不会发生变化，因为a和b指向同一个数组了现在
		//b中原来指向的数组就没有引用变量指向他了，就是垃圾内存，等待回收。
		a[0] = 555;
		System.out.println("修改a[0]为元素555之后b[0]中的元素为：" + b[0]);
	}
}