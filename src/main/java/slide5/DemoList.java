package slide5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println("List" + list.toString());

        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(200);

        set.addAll(list);
        System.out.println("Set:" + set.toString());
    }
}
