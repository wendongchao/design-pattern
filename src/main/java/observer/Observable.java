package observer;

import java.util.Observer;

/**
 * 抽象的被观察者接口
 */
public interface Observable {
	//添加一个观察者
	public void AddObserver(Observer observer);
	//删除一个观察者
	public void DeleteObserver(Observer observer);
	//通知观察者
	public void Notify(String context);
}
