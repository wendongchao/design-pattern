package strategy;

public class Context {
    public IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void operate(){
        this.iStrategy.operate();
    }
}
