import static org.junit.Assert.*;

import javax.crypto.spec.PBEKeySpec;

import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void filelinks()  throws IOException{
        Path filePath = Path.of("C:/Users/Greg/Documents/GitHub/markdown-parser/test-file.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("https://something.com","some-thing.html");
        assertEquals(list,links);
    }
}