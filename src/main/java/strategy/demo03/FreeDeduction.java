package strategy.demo03;

import org.omg.PortableServer.IdAssignmentPolicy;

/**
 * @author wendongchao
 * @Date 2021/3/19 13:45
 */
public class FreeDeduction implements IDeduction {
    //自由扣款
    @Override
    public boolean exec(Card card, Trade trade) {
        //直接从自由余额中扣除
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
