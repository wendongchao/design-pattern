package template;

/**
 * 抽象模板中的基本方法尽量使用protected类型，
 * 不需要暴露的属性和方法尽量不要设置为protected类型，
 * 实现类若非必要，尽量不要扩大父类中的访问权限
 */

public abstract class HummerModel {
    //基本抽象方法
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    /*
    模板方法
    子类继承钩子方法，修改结果，导致模板方法的实现方式改变，
    相当于子类修改了，影响了父类行为的结果
     */
    final public void run(){
        //调用基本方法，完成相关的逻辑
        this.start();
        this.engineBoom();

        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }
    //实现方法，钩子方法
    //该方法的返回值决定抽象类的部分执行结构
    protected boolean isAlarm(){
        return true;
    }
}

