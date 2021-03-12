package adapter;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("名字");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位");
        return null;
    }

    @Override
    public String getHomeTelNumer() {
        System.out.println("家庭电话");
        return null;
    }
}
