package strategy.demo01;

public class Context {

    public IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }
}
