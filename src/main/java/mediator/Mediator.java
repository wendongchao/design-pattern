package mediator;

/**
 * 具体中介者，实现中介者抽象类
 */
public class Mediator extends AbstractMediator {

	//中介者最重要的方法
	@Override
	public void execute(String str,Object...objects){
		if(str.equals("purchase.buy")){//采购
			this.buyComputer((Integer) objects[0]);
		}else if(str.equals("sale.sell")){//销售
			this.sellComputer((Integer) objects[0]);
		}else if(str.equals("sale.offsell")){//打折
			this.offSell();
		}else if(str.equals("stock.clear")){//清仓
			this.clearStock();
		}
	}
	//采购
	private void buyComputer(int number){
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus>80){
			System.out.println("采购IBM电脑："+number+"台");
		}else{
			int buyNumber = number/2;
			System.out.println("采购IBM电脑："+buyNumber+"台");		}
	}
	//销售
	private void sellComputer(int number){
		if(super.stock.getStockNumber()<number){
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}
	//打折
	private void offSell(){
		System.out.println("折价销售IBM电脑："+stock.getStockNumber()+"台");
	}
	//清仓
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
}
