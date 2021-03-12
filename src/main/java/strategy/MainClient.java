package strategy;

/**
 * 策略模式：定义一组算法，将每个算法都封装起来，并且使他们之间可以互换
 */
public class MainClient {
    public static void main(String[] args) {
        Context context;
        System.out.println("拆开第一个");
        context = new Context(new BockBoor());
        context.operate();
        System.out.println("拆开第二个");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("拆开第三个");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
