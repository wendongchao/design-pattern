package strategy.demo03;

/**
 * @author wendongchao
 * @Date 2021/3/19 13:49
 */
public class StrategyFactory {
    //策略工厂
    public static IDeduction getDeduction(StrategyMan strategy) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(strategy.getValue()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return deduction;
    }
}
