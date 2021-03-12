package proxy;

/**
 * 代理模式：抽象类或接口
 */
public interface IGamePlayer {
    public void login(String user, String password);
    public void killBoss();
    public void upgrade();
}
