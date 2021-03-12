package factory.abstractFactory;

/**
 * 工厂创造器：创建对象一样创建工厂
 */
public class FactoryProducer {

	public static AbstractFactory getFactotry(String choice){
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
