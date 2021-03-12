package factory.abstractFactory;

/**
 * 抽象工厂实现
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType){
		if(colorType==null){
			return null;
		}
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}else if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}
	
	@Override
	public Shape getShape(String shapeType){
		return null;
	}
	
}
