import java.util.HashMap;
import java.util.Map;

public class name {

    public static void main(String[] args) {
        add();
    }

    public static void add(){

        Map<String,Object> map =new HashMap<String,Object>();
        map.put("string",222);
        System.out.println("----------"+map.get("string").toString());
    }
}
