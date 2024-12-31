package StreamTasksMedium;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().skip(3).limit(5).forEach(System.out::println);
    }
}
