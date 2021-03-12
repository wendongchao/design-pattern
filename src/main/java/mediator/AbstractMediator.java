package mediator;

/**
 * 抽象中介者
 */
public abstract class AbstractMediator {
	protected Purchase purchase;//采购
	protected Sale sale;//销售
	protected Stock stock;//库存
	//构造函数，注入属性
	public AbstractMediator(){
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	//中介者最重要的方法叫做事件方法，处理多个对象之间的关系
	public abstract void execute(String str ,Object...objects);
}
