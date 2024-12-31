package StreamTasksMedium;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","Java","Phyton","C++","Programming","World");
        long count = list.stream().flatMapToInt(String::chars).filter(ch -> ch == 'a').count();
        System.out.println(count);
    }
}
