package builder;

/**
 * model2：具体模板类
 */
public class BmwModel extends CarModel{
    @Override
    protected void alarm(){
        System.out.println("BmwModel鸣笛");
    }
    @Override
    protected void engineBoom(){
        System.out.println("BmwModel引擎");
    }
    @Override
    protected void start(){
        System.out.println("BmwModel发动");
    }
    @Override
    protected void stop(){
        System.out.println("BmwModel停车");
    }
}
