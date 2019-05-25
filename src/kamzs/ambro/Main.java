package kamzs.ambro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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




        list.stream()
                        .forEach(x-> System.out.println(x.toUpperCase()));

        List<String> list2 = list.stream()
                .map(x-> x.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }
}
