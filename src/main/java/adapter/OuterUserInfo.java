package adapter;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        System.out.println(this.baseInfo.get("userName"));
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println(this.baseInfo.get("homeAddress"));
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println(this.baseInfo.get("mobileNumber"));
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println(this.baseInfo.get("officeTelNumber"));
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println(this.baseInfo.get("jobPosition"));
        return null;
    }

    @Override
    public String getHomeTelNumer() {
        System.out.println(this.baseInfo.get("homeTelHome"));
        return null;
    }
}
