package lesson22.homeTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IsUnique {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Eug", "Mits");
        map.put("Max", "Field");
        map.put("Sam", "Cole");

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            String value = entry.getValue();
            if (value.equals(map.get("Eug"))) {
                itr.next();
            } else { continue;
            }
        }
    }
}