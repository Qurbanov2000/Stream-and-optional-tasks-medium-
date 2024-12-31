package StreamTasksMedium;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Elcin","Samir","Akif","Adem","Nadir");
        list.stream().filter(s->s.charAt(0)=='A').sorted().forEach(System.out::println);

    }
}
