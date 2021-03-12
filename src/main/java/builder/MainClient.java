package builder;

import java.util.ArrayList;

/**
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程
 * 可以创建不同的表示
 */
public class MainClient {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();
    }
}
