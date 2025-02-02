import java.util.*;

public class Num2Rmb
{
	private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
	private String[] unitArr = {"拾", "佰", "仟"};
	/**
	*把一个浮点数分解成整数和小数部分字符串
	*@param num 需要被分解的浮点数
	*@return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
	*/
	private String[] divide(double num)
	{
		//将一个浮点数强制类型转换为long，即得到它的整数部分
		long zheng = (long)num;
		//浮点数减去整数部分，得到小数部分，小数部分乘以100后再取整得到两位小数
		long xiao = Math.round((num - zheng) * 100);
		//下面用两种方法把整数转换为字符串
		return new String[]{zheng + "", String.valueOf(xiao)};
	}
	
	/**
	*把一个四位的数字字符串变成汉字字符串
	*@param numStr 需要被转换的四位数字字符串
	*@return 四位的数字字符串被转换成汉字字符串
	*/
	private String toHanStr(String numStr)
	{
		String result = "";
		int numLen = numStr.length();
		for (int i = 0; i < numLen; i++)
		{
			//把char型数字换成int型数字，因为他们的ASCII码值恰好相差48
			//因此把char型数字减去48得到int型数字，例如'4'被转换成4
			int num = numStr.charAt(i) - 48;
			//如果不是最后一位数字，而且数字不是零，则需要添加单位（仟，佰，拾）
			if (i != numLen - 1 && num != 0)
			{
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}
			//否则不要添加单位
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
		//测试把一个浮点数分解成整数和小数部分
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
		//测试把一个四位数的数字字符串变成汉字字符
		System.out.println(nr.toHanStr("6109"));
	}
}