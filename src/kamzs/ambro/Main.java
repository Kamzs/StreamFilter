package kamzs.ambro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("aaaa");
        list.add("aaabba");
        list.add("bbba");
        list.add("xaaaaa");
        list.add("aaaa");

        list.stream()   .filter(s -> s.startsWith("a"))
                        .forEach(x-> System.out.println(x));

    }
}
