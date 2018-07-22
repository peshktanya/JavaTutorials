package Lesson23.Files;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FileTest {


    // when running cross platform there are differences to be aware of
    // the system properties may not have a / at the end
    // and building file paths by hand can be problematic requiring
    // lots of care
    // so we use the Paths.get instead
    // http://docs.oracle.com/javase/7/docs/api/java/nio/file/Paths.html
    // Then use the returned Path object toFile to create the file object
    // Both Path and Paths have been available since Java 1.7
    // https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html


    @Test
    public void aNewFileDoesNotCreateAFile() throws IOException {
        File aTempFile = new File("d:/tempJavaForTesters.txt");
        assertEquals(aTempFile.exists(), (false));
    }

    @Test
    public void pathsGetExampleForCrossPlatform() throws IOException {

        String tempDir = System.getProperty("java.io.tmpdir");

        // you would probably just use File for this one
        File theFile = Paths.get(tempDir, "file.txt").toFile();
        assertTrue(theFile.getAbsolutePath().endsWith(File.separator + "file.txt"));

        theFile = Paths.get(tempDir, "temp1", "file.txt").toFile();
        assertTrue(theFile.getAbsolutePath().endsWith(String.format("%s%s%1$s%s",
                            File.separator, "temp1", "file.txt")));

        theFile = Paths.get(tempDir, "temp1","temp2", "temp3", "file.txt").toFile();
        assertTrue(theFile.getAbsolutePath().endsWith(String.format("%s%s%1$s%s%1$s%s%1$s%s",
                            File.separator, "temp1", "temp2", "temp3", "file.txt")));
    }


    @Test
    public void createAFileAndDeleteItAlternativeConstructor() throws IOException {

        String tempDir = System.getProperty("java.io.tmpdir");
        File aTempFile = new File(tempDir, "tempJavaForTesters.txt");
        assertFalse(aTempFile.exists());

        aTempFile.createNewFile();
        assertTrue(aTempFile.exists());

        aTempFile.delete();
        assertFalse(aTempFile.exists());
    }

    @Test
    public void createLongerPathExample(){

        String tempDirectory = System.getProperty("java.io.tmpdir");
        File aFile = new File(tempDirectory);
        aFile = new File(aFile, "1");
        aFile = new File(aFile, "2");
        aFile = new File(aFile, "3");
        aFile = new File(aFile, "4");

        // make it an easy cross platform comparison
        String filePathWithDots = aFile.getAbsolutePath().replace(File.separator, ".");
        assertTrue(filePathWithDots.endsWith(".1.2.3.4"));

        Path aPath = Paths.get(tempDirectory, "1", "2", "3", "4");
        assertEquals(aFile.getAbsolutePath(),
                     aPath.toFile().getAbsolutePath());
    }

    @Test
    public void listTempDirectory(){
        File tempDir = new File(System.getProperty("java.io.tmpdir"));

        String[] fileList = tempDir.list();

        for(String fileInList : fileList){
            System.out.println(fileInList);
        }
    }

}