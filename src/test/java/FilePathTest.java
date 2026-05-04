import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilePathTest {

    @Test
//    public void testHardcodedPath() {
//        String directory = "documents";
//        String filename = "report.txt";
//
//        // Cố tình gán cứng dấu gạch chéo (forward slash) của Linux/MacOS
//        String hardcodedPath = directory + "/" + filename;
//
//        File file = new File(directory, filename);
//
//        // Test này sẽ PASS trên Ubuntu và MacOS
//        // Nhưng sẽ FAIL trên Windows vì Windows sử dụng backslash (\)
//        // file.getPath() trên Windows sẽ trả về "documents\report.txt"
//        assertEquals(hardcodedPath, file.getPath());
//    }
    public void testRefactoredPathWithNio() {
        String directory = "documents";
        String filename = "report.txt";

        // Sử dụng Paths.get() để tạo đường dẫn chuẩn
        Path expectedPath = Paths.get(directory, filename);

        File file = new File(directory, filename);

        // Test này sẽ PASS trên mọi hệ điều hành
        assertEquals(expectedPath.toString(), file.getPath());
    }
}