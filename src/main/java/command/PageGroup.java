package command;

public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("新增一个页面");
    }

    @Override
    public void delete() {
        System.out.println("删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("修改一个页面");
    }

    @Override
    public void plan() {
        System.out.println("页面变更计划");
    }
}
