package strategy.demo03;

/**
 * @author wendongchao
 * @Date 2021/3/19 13:46
 */
public class DeductionContext {
    //扣款策略
    private IDeduction deduction = null;

    //构造函数传递策略
    public DeductionContext(IDeduction _deduction) {
        this.deduction = _deduction;
    }

    //执行扣款
    public boolean exec(Card card, Trade trade) {
        return this.deduction.exec(card, trade);
    }
}
