package StreamTasksMedium;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Hello java",
                "Hello c++",
                "Hello python",
                "Hello pascal"
        );
        list.stream().filter(s->s.contains("java")).forEach(System.out::println);
    }
}
