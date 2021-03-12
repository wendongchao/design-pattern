package mediator;

/**
 * 采购管理
 */
public class Purchase extends AbstractColleague {
	public Purchase(AbstractMediator abstractMediator){
		super(abstractMediator);
	}
	public void buyIBMcomputer(int number){
		super.abstractMediator.execute("purchase.buy",number);
	}
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}
}

