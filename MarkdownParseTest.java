import static org.junit.Assert.*;

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
        Path filePath = Path.of("./test-file.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("https://something.com","some-thing.html");
        assertEquals(list,links);
    }
    
    @Test
    public void filelinks2()  throws IOException{
        Path filePath = Path.of("./test2.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("https://something.com","some-thing.html");
        assertEquals(list,links);
    }

    @Test
    public void filelinks3()  throws IOException{
        Path filePath = Path.of("./Test3.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("some-thing.html");
        assertEquals(list,links);
    }

    @Test
    public void filelinks4()  throws IOException{
        Path filePath = Path.of("./Markdown.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("https://something.com","some-thing.html");
        assertEquals(list,links);
    }

    @Test
    public void filelinks5()  throws IOException{
        Path filePath = Path.of("./Markdown.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("https://something.com","some-thing.html");
        assertEquals(list,links);
    }

    @Test
    public void Snip1test() throws IOException{
        Path filePath = Path.of("./Snippet1.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(list,links);
    }

    @Test
    public void Snip2test() throws IOException{
        Path filePath = Path.of("./Snippet2.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("a.com", "a.com(())", "example.com");
        assertEquals(list,links);
    }

    @Test
    public void Snip3test() throws IOException{
        Path filePath = Path.of("./Snippet3.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(a);
        List<String> list = List.of("https://www.twitter.com", 
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/");
        assertEquals(list,links);
    }

    @Test
    public void Snip1revtest() throws IOException{
        Path filePath = Path.of("./Snippet1.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = ReviewedMarkdownParse.getLinks(a);
        List<String> list = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(list,links);
    }

    @Test
    public void Snip2revtest() throws IOException{
        Path filePath = Path.of("./Snippet2.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = ReviewedMarkdownParse.getLinks(a);
        List<String> list = List.of("a.com", "a.com(())", "example.com");
        assertEquals(list,links);
    }

    @Test
    public void Snip3revtest() throws IOException{
        Path filePath = Path.of("./Snippet3.md");
        String a = Files.readString(filePath);
        ArrayList<String> links = ReviewedMarkdownParse.getLinks(a);
        List<String> list = List.of("https://www.twitter.com", 
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/");
        assertEquals(list,links);
    }
}
