package tests;

import org.testng.annotations.Test;

public class CheckBox extends BaseTest {
    @Test
    public void checkCheckBoxRemoveAndAdd() {
        elements.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        elements.findCheckBox();
        elements.verificationCheckBox();
    }

    @Test
    public void checkCheckBoxEnableAndDisable() {
        elements.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        elements.checkEnable();
        elements.writeText("Test");
        elements.checkDisable();
    }
}
