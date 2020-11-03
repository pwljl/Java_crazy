package pw_6_5;

public class CarSpeedMeter extends SpeedMeter{
    private double radius;
    public CarSpeedMeter(double radius)
    {
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        if (radius > 50)
        {
            System.out.println("半径必须小于50");
            return;
        }
        this.radius = radius;
    }
//    public static void test(int a, String... books)
//    {
//        //books被当作数组处理
//        for (var tmp : books)
//        {
//            System.out.println(tmp);
//        }
//        System.out.println(a);
//    }



    public double calGirth()
    {
        return radius * 2 *Math.PI;
    }

    public static void main(String[] args)
    {
        var csm = new CarSpeedMeter(0.34);
        csm.setTurnRate(15);
        csm.radius = 100;
        System.out.println(csm.getSpeed());
    }
}
