package strategy.demo03;

/**
 * @author wendongchao
 * @Date 2021/3/19 13:37
 */
public class Card {
    //IC卡号码
    private String cardNo = "";//卡内的固定交易金额
    private int steadyMoney = 0;//卡内自由交易金额
    private int freeMoney = 0;//getter/setter方法

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}
