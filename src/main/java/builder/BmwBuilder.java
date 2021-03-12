package builder;

import java.util.ArrayList;

/**
 * 具体建造者
 */
public class BmwBuilder extends CarBuilder{
    private  BmwModel bmwModel = new BmwModel();
    @Override
    public CarModel getCarModel(){
        return this.bmwModel;
    }
    @Override
    public void setSequence(ArrayList<String> sequence){
        this.bmwModel.setSequence(sequence);
    }
}
