package chainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * 责任链模式：使多个对象都有机会处理请求
 */
public class MainClient {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> list = new ArrayList<IWomen>();
        for (int i=0;i<5;i++){
            list.add(new Women(rand.nextInt(4),"逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : list){
            father.HandleMessage(women);
        }
    }
}
