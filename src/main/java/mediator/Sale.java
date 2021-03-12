package mediator;

import java.util.Random;

/**
 * 销售管理，继承抽象同事类
 */
public class Sale extends AbstractColleague {
	//有参构造创建抽象中介者
	public Sale(AbstractMediator abstractMediator){
		super(abstractMediator);
	}
	//卖出
	public void sellIBMComputer(int number){
		super.abstractMediator.execute("sale.sell",number);
		System.out.println("销售IBM电脑"+number+"台");
	}
	//销售状态
	public int getSaleStatus(){
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("IBM电脑的销售情况为："+saleStatus);
		return saleStatus;
	}
	//打折销售
	public void offSale(){
		super.abstractMediator.execute("sale.offsell");
	}
}
