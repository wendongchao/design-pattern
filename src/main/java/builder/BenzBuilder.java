package builder;

import java.util.ArrayList;

/**
 * 具体建造者
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();
    @Override
    public CarModel getCarModel(){
        return this.benzModel;
    }
    @Override
    public void setSequence(ArrayList<String> sequence){
        this.benzModel.setSequence(sequence);
    }
}
