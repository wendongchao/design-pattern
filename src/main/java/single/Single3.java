package single;

/**
 * 双检锁
 */
public class Single3 {
	private volatile static Single3 single3;
	private Single3(){}
	public static Single3 getSingle3(){
		if(single3==null){
			synchronized (Single3.class){
				if(single3==null){
					single3 = new Single3();
				}
			}
		}
		return single3;
	}
}
