package decorative;

public class FouthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("尊敬的xxx家长");
        System.out.println(".............");
        System.out.println("语文 12，数学 32");
        System.out.println(".............");
        System.out.println("家长签名：");
    }

    @Override
    public void sign(String name) {
        System.out.println("签名："+name);
    }
}
