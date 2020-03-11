package tests;

import org.testng.annotations.Test;

public class FileUpload extends BaseTest {
    @Test
    public void checkFileUpload() {
        elements.openPage("http://the-internet.herokuapp.com/upload");
        elements.fileUpload("\\src\\main\\resources\\Котик.jpg");
        elements.verificationFileUpload();
    }
}
