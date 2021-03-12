package observer;

/**
 * 观察者模式
 */
public class MainClient {
	public static void main(String[] args) {
		//创建观察者
		LiSi liSi = new LiSi();
		LiuSi liuSi = new LiuSi();
		WangSi wangSi = new WangSi();
		//创建被观察者
		HanFeiZi hanFeiZi = new HanFeiZi();
		//把观察者添加到被观察者中
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(liuSi);
		hanFeiZi.addObserver(wangSi);
//		hanFeiZi.AddObserver(liSi);
//		hanFeiZi.AddObserver(liuSi);
//		hanFeiZi.AddObserver(wangSi);
		//被观察者活动
		hanFeiZi.havaBreakfast();
	}
}
