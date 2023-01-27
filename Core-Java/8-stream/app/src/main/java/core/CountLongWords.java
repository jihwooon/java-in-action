package core;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("/Users/jihwooon/Documents/Core-Java/8-stream/app/src/main/resources/alice.txt")),
                StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12)
                count++;
        }
        System.out.println("count " + count);

        count = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();
        System.out.println("parallelStream " + count);

        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println("stream = " + count);
    }
}
