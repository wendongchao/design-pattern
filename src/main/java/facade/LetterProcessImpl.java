package facade;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("内容："+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("地址："+address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("放到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄");
    }
}
