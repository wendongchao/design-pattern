package proxy.dynamicProxy;

/**
 * 接口的具体实现类，代理模式的真正工作者
 */
public class Maotai implements SellWine {
	@Override
	public void wine(){
		System.out.println("售卖茅台酒");
	}
}
