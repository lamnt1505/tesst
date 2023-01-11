package slide5;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("Tuan");
        name.add("Hanh");
        name.add("Phuong");
        name.add("Hang");

        name.set(1,"Khanh");
        name.remove("Tuan");
        System.out.println(name.toString());
    }
}
