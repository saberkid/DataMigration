import java.util.HashMap;

/**
 * Created by aoshi on 2016/6/29.
 */
public class MyDatabase {
    private HashMap data;

    public MyDatabase(){
        this.data = new HashMap<Integer, String>();
    }

    public static void main(String[] args) {
        MyDatabase a = new MyDatabase();
        a.data.put(1, "name");
        System.out.println(a);
    }
}
