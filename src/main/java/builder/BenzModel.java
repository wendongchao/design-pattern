package builder;

/**
 * model2：具体模板类
 */
public class BenzModel extends CarModel{
    @Override
    protected void alarm(){
        System.out.println("BenzModel鸣笛");
    }
    @Override
    protected void engineBoom(){
        System.out.println("BenzModel引擎");
    }
    @Override
    protected void start(){
        System.out.println("BenzModel发动");
    }
    @Override
    protected void stop(){
        System.out.println("BenzModel停车");
    }
}
