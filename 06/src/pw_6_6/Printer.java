package pw_6_6;

import lee.Output;

interface Product
{
    int getProduceTime();
}

//让Printer类实现Output和Pruduct接口
public class Printer implements Output, Product {
    private String[] printData = new String[MAX_CACHE_LINE];
    //用以记录当前需打印的作业数
    private int dataNum = 0;


    public void out()
    {
        while(dataNum > 0)
        {
            System.out.println("打印机打印：" + printData[0]);
            //把作业队列整体前移一位，并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    public void getData(String msg)
    {
        if (dataNum >= MAX_CACHE_LINE)
        {
            System.out.println("输出队列已满，添加失败");
        }
        else
        {
            //把打印数据添加进队列里，已经保存的数据的数量加1
            printData[dataNum++] = msg;
        }
    }

    public int getProduceTime()
    {
        return 45;
    }

    public static void main(String[] args)
    {
        //创建一个Printer对象，当成Output使用
        Output o = new Printer();
        o.getData("轻量级Java EE企业应用实战");
        o.getData("疯狂Java讲义");
        o.out();
        o.getData("疯狂Android讲义");
        o.getData("疯狂Ajax讲义");
        o.out();
        //调用output接口中定义的默认方法
    }
}

