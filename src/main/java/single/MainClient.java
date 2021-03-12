package single;

public class MainClient {
    public static void main(String[] args) {
     Single4 single4 =  Single4.INSTANCE;
     Single4 single3 =  Single4.INSTANCE;
        System.out.println(single3 == single4);
    }
}
