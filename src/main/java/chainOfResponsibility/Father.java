package chainOfResponsibility;

public class Father extends Handler {

    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("----------女儿-----父亲--------");
        System.out.println(women.getRequest());
        System.out.println("父亲：同意");
    }
}
