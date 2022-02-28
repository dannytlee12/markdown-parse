import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

//hi
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> expectedLinks = List.of();
        assertEquals("Check expected links for test-file.md", expectedLinks, links);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("/Users/danny/Desktop/markdown-parse/test-file.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void labTest1() throws IOException {
        String contents= Files.readString(Path.of("/Users/danny/Desktop/markdown-parse/test-file.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
}