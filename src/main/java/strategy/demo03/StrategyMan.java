package strategy.demo03;

/**
 * @author wendongchao
 * @Date 2021/3/19 13:48
 */
public enum StrategyMan {

    SteadyDeduction("com.cbf4life.common.SteadyDeduction"),
    FreeDeduction("com.cbf4life.common.FreeDeduction");
    String value = "";

    private StrategyMan(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }
}
