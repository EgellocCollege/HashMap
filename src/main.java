import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        //map 1
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(5, "E");

//map 2
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(1, "G");   //It will replace the value 'A'
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");   //A new pair to be added

////Merge maps
//        map1.putAll(map2);

        map2.keySet().removeAll(map1.keySet());

        System.out.println(map2);

    }
}
