package composite;





import java.util.ArrayList;

/**
 * 组合模式：将对象组合成树形结构以表示  部分--整体 的层次结构，使得用户对单个对象和组合
 * 对象的使用具有一致性。
 */
public class MainClient {
    public static void main(String[] args) {
        
    }
    public static String getTreeInfo(Branch root){
        ArrayList<Corp>  aubordinateList = root.getSubordinate();
        String info = "";
        for (Corp corp : aubordinateList) {
            if(corp instanceof Leaf){
                info += corp.getInfo()+"\n";
            }else{
                info += corp.getInfo()+"\n"+getTreeInfo((Branch) corp);
            }
        }
        return info;
    }
}
