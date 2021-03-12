package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
 *  public static Object newProxyInstance(ClassLoader loader,
 *                                           Class<?>[] interfaces,
 *                                           InvocationHandler h)
 *  该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
 * 	第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
 * 	第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
 * 	第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
 *  根据传入的目标返回一个代理对象
 */
public class MainClient {
	public static void main(String[] args) throws Exception{
		Maotai m = new Maotai();
		InvocationHandler in = new GuiTaiA(m);
		SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(m.getClass().getClassLoader(),Maotai.class.getInterfaces(),in);
		dynamicProxy.wine();
		System.out.println("dynamicProxy class name:"+dynamicProxy.getClass().getName());
	}
}
