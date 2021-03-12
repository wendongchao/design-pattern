package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者实例
 */
public class LiSi implements Observer {

	//  使用javaAPI中java.util.Observer替换Observer观察者实例
//	@Override
//	public void update(String context) {
//		System.out.println("李四：目标活动！");
//		reportToOne(context);
//		System.out.println("李四：汇报完毕！");
//	}
	public void reportToOne(String context){
		System.out.println("通知：目标活动"+context);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("李四：目标活动！");
		reportToOne(arg.toString());
		System.out.println("李四：汇报完毕！");
	}
}
