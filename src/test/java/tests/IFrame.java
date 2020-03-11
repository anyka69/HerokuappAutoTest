package tests;

import org.testng.annotations.Test;

public class IFrame extends BaseTest {
    @Test
    public void checkIFrame() {
        elements.openPage("http://the-internet.herokuapp.com/frames");
        elements.openIFrame();
        elements.verificationIFrame();
    }
}
