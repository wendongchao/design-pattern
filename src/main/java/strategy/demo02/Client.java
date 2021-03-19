package strategy.demo02;

import java.util.Arrays;

/**
 * @author wendongchao
 * @Date 2021/3/18 14:52
 */
public class Client {

    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = Integer.parseInt("1");
        String symbol = "+";
        //符号
        int b = Integer.parseInt("2");
        System.out.println("运行结果为：" + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
    }
}
