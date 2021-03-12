package chainOfResponsibility;

public class Husband extends Handler {
    public Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("----------妻子-----丈夫--------");
        System.out.println(women.getRequest());
        System.out.println("丈夫：同意");
    }
}
