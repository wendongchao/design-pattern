package template;

/**
 * template：具体实现类
 */
public class Hummer1 extends HummerModel{
    private boolean alarmFlag=true;
    @Override
    protected void alarm(){
        System.out.println("h1鸣笛");
    }
    @Override
    protected void engineBoom(){
        System.out.println("h1引擎");
    }
    @Override
    protected void start(){
        System.out.println("h1发动");
    }
    @Override
    protected void stop(){
        System.out.println("h1停车");
    }
    @Override
    protected boolean isAlarm(){
        return this.alarmFlag;
    }
    public void setAlarm(boolean isAlarm){
        this.alarmFlag=isAlarm;
    }
}
