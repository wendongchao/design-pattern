package chainOfResponsibility;

public class Son extends Handler {
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("----------母亲-----儿子--------");
        System.out.println(women.getRequest());
        System.out.println("儿子：同意");
    }
}
