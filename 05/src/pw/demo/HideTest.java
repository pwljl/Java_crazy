package pw.demo;

class Parent{
    public String tag = "疯狂Java讲义";
}
class Derived extends Parent{
    //定义一个私有的tag变量来隐藏父类的tag实例变量
    private String tag = "轻量级Java EE企业应用实战";
}

public class HideTest {
    public static void main(String[] args) {
        var d = new Derived();
        //将d变量显示的向上转型为Parent后，才可以访问tag，直接用d.tag访问不了
        //因为这句话是访问子类的tag变量，而子类中的tag是private类型的，只能类内部访问
        System.out.println(((Parent) d).tag);
        //System.out.println(Derived.tag);,这样访问也不行
    }
}
