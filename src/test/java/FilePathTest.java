import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilePathTest {

    @Test
    public void testHardcodedPath() {
        String directory = "documents";
        String filename = "report.txt";

        // Cố tình gán cứng dấu gạch chéo (forward slash) của Linux/MacOS
        String hardcodedPath = directory + "/" + filename;

        File file = new File(directory, filename);

        // Test này sẽ PASS trên Ubuntu và MacOS
        // Nhưng sẽ FAIL trên Windows vì Windows sử dụng backslash (\) 
        // file.getPath() trên Windows sẽ trả về "documents\report.txt"
        assertEquals(hardcodedPath, file.getPath());
    }
}