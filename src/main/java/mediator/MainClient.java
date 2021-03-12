package mediator;

/**
 * 中介者模式：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，
 * 从而使其耦合松散，而且可以独立地改变他们之间的交互。
 */
public class MainClient {
	public static void main(String[] args) {
		AbstractMediator abstractMediator = new Mediator();
		System.out.println("-----购买任意购买电脑------");
		Purchase purchase = new Purchase(abstractMediator);
		purchase.buyIBMcomputer(100);
		System.out.println("\n------销售人员销售电脑--------");
		Sale sale = new Sale(abstractMediator);
		sale.sellIBMComputer(50);
		System.out.println("\n------库房管理人员清库处理--------");
		Stock stock = new Stock(abstractMediator);
		stock.clearStock();
	}
}
