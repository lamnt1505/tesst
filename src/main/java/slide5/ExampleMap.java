package slide5;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("SamSung",200d);
        map.put("Nokia",100d);
        map.put("Sony",300d);

        System.out.println("Map: " + map.toString());

        map.put("Samsung",400d);
        System.out.println("Map: " + map.toString());

        for (Map.Entry<String, Double> item : map.entrySet()) {
            System.out.println("Key" + item.getKey());
            System.out.println(" - Value: " + item.getValue());
        }
    }
}
