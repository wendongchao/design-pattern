package single.demo01;

/**
 * 懒汉模式
 * 类加载是对象还不存在，就是所谓的延迟加载方式，需要时在进行创建，这样会导致线程不安全的问题
 * 需要在创建实例对象是加上synchronized
 */
public class Single2 {

    private Single2() {
    }

    private static Single2 single = null;

    public static Single2 getInstance() {
        if (single == null) {
            synchronized (Single2.class) {
                single = new Single2();
            }
        }
        return single;
    }
}
