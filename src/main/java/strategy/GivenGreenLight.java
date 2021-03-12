package strategy;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开路灯，放行");
    }
}
