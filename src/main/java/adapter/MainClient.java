package adapter;

/**
 * 适配器模式：将一个类的接口变换成客户端所期待的另一个接口，
 * 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * 适配器模式分为：类适配器，对象适配器
 * 类适配器：类间继承，（类与类之间需要的继承）
 * 对象适配器：对象的合成关系，也就是类关联，（使用构造方法注入其他对象，或者用其他方式）
 */
public class MainClient {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        for(int i=0;i<10;i++){
            userInfo.getUserName();
        }
        IUserInfo outerInfo = new OuterUserInfo();
        for(int i=0;i<10;i++){
            outerInfo.getUserName();
        }
    }
}
