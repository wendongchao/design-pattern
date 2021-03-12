package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 被代理类，可以在这里面添加一些方法，来丰富代理类的内容
 * 如：代理类--->System.out.println("售卖茅台酒");
 *     被代理类--->System.out.println("销售开始，柜台是：" + this.getClass().getSimpleName());
 * 		          method.invoke(obj, args);
 * 		          System.out.println("销售结束");
 *
 * 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
 * 该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类
 */
public class GuiTaiA implements InvocationHandler {
	//目标对象
	private Object obj;

	GuiTaiA(Object obj){
		this.obj = obj;
	}

	//proxy   代理对象
	//method  代理对象调用的方法
	//args    调用的方法中的参数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
		System.out.println("销售开始，柜台是：" + this.getClass().getSimpleName());
		method.invoke(obj, args);
		System.out.println("销售结束");
		return obj;
	}
}
