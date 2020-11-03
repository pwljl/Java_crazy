package pw_6_5;

public abstract class SpeedMeter {
    //转速
    private double turnRate;
    public SpeedMeter(){}
    public abstract double calGirth();
    public void setTurnRate(double turnRate)
    {
        this.turnRate = turnRate;
    }
    //计算速度的通用方法
    public double getSpeed()
    {
        //速度等于周长 * 转速
        return calGirth() * turnRate;
    }
}
