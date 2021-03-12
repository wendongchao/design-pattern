package factory.factory;

/**
 * 调用者：调用工厂类的方法/类
 */
public class MainShapeFactoryDemo {

	public static void main(String[] args){
		ShapeFactory sf = new ShapeFactory();

		Shape shape = sf.getShape("CIRCLE");
		shape.draw();
	}
}
