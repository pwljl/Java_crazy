package pw_6_4;

import java.util.Arrays;

class Person
{
    private int age;

    public Person(){}
    public Person(int age)
    {
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }
}

public class FinalReferenceTest {
    public static void main(String[] args)
    {
        //final修饰的，只可以修改其中的值，不可以令iArr指向另一个数组
        final int[] iArr = {5, 6, 12, 9};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));
        //下面语句出错，不能再重新赋值
//        iArr = null;
//        final
        final var p = new Person(55);
//        改变Person对象的实例变量，可以
        p.setAge(23);
        System.out.println(p.getAge());
    }
}
