package mediator;

/**
 * 库存管理实现类，继承抽象销售类
 */
public class Stock extends AbstractColleague {
	//有参构造函数创建抽象中介者
	public Stock(AbstractMediator abstractMediator){
		super(abstractMediator);
	}
	private static int COMPUTER_NUMBER = 100;
	//增加库存
	public void increase(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER +100;
		System.out.println("库存数量为："+COMPUTER_NUMBER);
	}
	//卖出number，剩余库存
	public void decrease(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量为："+COMPUTER_NUMBER);
	}
	//得到库存数量
	public  int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	//清理库存
	public void clearStock(){
		System.out.println("清理库存数量为："+COMPUTER_NUMBER);
		super.abstractMediator.execute("stock.clear");
	}
}
