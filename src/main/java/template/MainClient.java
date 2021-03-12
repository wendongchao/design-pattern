package template;

/**
 * 模板方法模式
 * template：场景类
 */
public class MainClient {
    static String a = "a";
    public static void main(String[] args) {
        HummerModel model2=new Hummer2();
        HummerModel model1=new Hummer1();
        Hummer1 h1 = new Hummer1();
        h1.setAlarm(true);
        model1.run();
        System.out.println("====================");
        model2.run();

        this.me(a);

    }
    @Test
    public void Test01(){

    }
    public  void me(String c){
        this.a = this.a+"c";
        System.out.println(a);
    }
}
