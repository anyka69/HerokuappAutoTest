package tests;

import org.testng.annotations.Test;

public class ContextMenu extends BaseTest {
    @Test
    public void checkContextMenu(){
        elements.openPage("http://the-internet.herokuapp.com/context_menu");
        elements.rightClickTest();
        elements.validationTextAndClose();
    }
}
