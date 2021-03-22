package single.demo01;

/**
 * 饿汉模式
 * 类加载的时候对象已经存在了，线程安全
 * <p>
 * 代码体现
 * 1.私有的构造函数
 * 2.静态私有的本类对象
 * 3.静态共有的方法，返回该对象
 */
public class Single1 {
    private Single1() {
    }

    private static Single1 single = new Single1();

    public static Single1 getInstance() {
        return single;
    }
}
