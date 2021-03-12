package decorative;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportSort(){
        System.out.println("排名为25");
    }
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
