package template;

/**
 * template：具体实现类
 */
public class Hummer2 extends HummerModel{
    @Override
    protected void alarm(){
        System.out.println("h2鸣笛");
    }
    @Override
    protected void engineBoom(){
        System.out.println("h2引擎");
    }
    @Override
    protected void start(){
        System.out.println("h2发动");
    }
    @Override
    protected void stop(){
        System.out.println("h2停车");
    }
    @Override
    protected boolean isAlarm(){
        return false;
    }
}
