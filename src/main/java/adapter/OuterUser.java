package adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","张三");
        baseInfoMap.put("mobileNumber","电话号");
        return null;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeMap = new HashMap();
        officeMap.put("jobPosition","职位");
        officeMap.put("officeTelNumber","办公电话");
        return null;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeMap = new HashMap();
        homeMap.put("homeTelNumber","家庭电话");
        homeMap.put("homeAddress","家庭地址");
        return null;
    }
}
