package proxy;

/**
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
 */
public class MainClient {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
