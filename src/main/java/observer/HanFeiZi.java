package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者实例
 */
public class HanFeiZi  extends Observable implements IHanFeiZi {

	//定义数组存放观察者
	public List<Observer> list = new ArrayList<Observer>();

	@Override
	public void havaBreakfast() {
		System.out.println("韩非子：开始吃饭");
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("韩非子：开始吃饭");
		//  使用javaAPI中java.util.Observable来替换Observable被观察者接口
		//Notify("韩非子：开始吃饭");
	}

	@Override
	public void havaFun() {
		System.out.println("韩非子：开始娱乐");
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("韩非子：开始娱乐");
		//  使用javaAPI中java.util.Observable来替换Observable被观察者接口
		//Notify("韩非子：开始娱乐");
	}

//  使用javaAPI中java.util.Observable来替换Observable被观察者接口
//	@Override
//	public void AddObserver(Observer observer) {
//		list.add(observer);
//	}
//
//	@Override
//	public void DeleteObserver(Observer observer) {
//        list.remove(observer);
//	}
//
//	@Override
//	public void Notify(String context) {
//		for (Observer o: list) {
//			o.update(context);
//		}
//	}
}
