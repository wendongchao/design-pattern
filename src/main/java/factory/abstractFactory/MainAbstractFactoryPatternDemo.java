package factory.abstractFactory;

/**
 * 懒汉模式
 * 类加载是对象还不存在，就是所谓的延迟加载方式，需要时在进行创建，这样会导致线程不安全的问题
 * 需要在创建实例对象是加上synchronized

 * 抽象工厂实现类：调用者
 * 创建对象一样创建工厂
 * 代码体现：
 * 1.创建接口并创建实现接口的实体类
 * 2.创建抽象工厂并创建基础抽象工厂类的工厂
 * 3.创建类根据属性注入获取工厂（继承抽象类）
 * 4.工厂类根据属性注入获取实体类（实现接口类）
 */
public class MainAbstractFactoryPatternDemo {

	public static void main(String[] args){
		//获取工厂
		AbstractFactory abstractFactory = FactoryProducer.getFactotry("SHAPE");
		//获取对象
		Shape shape = abstractFactory.getShape("CIRCLE");
		//获取方法
		shape.draw();
	}
}
