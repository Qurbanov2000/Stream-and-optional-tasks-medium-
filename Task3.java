package StreamTasksMedium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","Java","Python","C++","Programming","World");
        list.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
        Optional<String> optional = list.stream().max(Comparator.comparing(String::length));
        System.out.println(optional.get());
    }
}
