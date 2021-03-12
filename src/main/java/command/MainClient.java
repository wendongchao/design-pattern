package command;

/**
 * 命令模式：
 */
public class MainClient {
    public static void main(String[] args) {
        Invoker li = new Invoker();
        System.out.println("-------------新增一项需求-------------");
        Command command = new AddRequirementCommand();
        li.setCommand(command);
        li.action();
    }
}
