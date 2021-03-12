package builder;

import java.util.ArrayList;

/**
 * 抽象建造者
 */
public abstract class CarBuilder {
    //抽象得到执行顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //抽象得到车辆模型
    public abstract CarModel getCarModel();
}
