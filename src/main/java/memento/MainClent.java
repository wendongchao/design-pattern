package memento;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 这样以后就可将该对象恢复到原先保存的状态。
 */
public class MainClent {
    public static void main(String[] args) {
        //定义发起人
        Originator originator = new Originator();
        //定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
