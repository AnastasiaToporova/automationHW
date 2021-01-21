package impl;

import api.BaseTest;
import org.junit.Test;
import pages.DocumentationPage;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class DocumentationPageTests extends BaseTest {


    @Test
    public void checkCodeExamplesArePresent() {
        List<String> codeExampleActualResults = storage.getPage(DocumentationPage.class).open().checkCode();
        for (int i = 0; i < consts.getCODE_EXAMPLE_LIST().size(); i++) {
            assertEquals(consts.getCODE_EXAMPLE_LIST().get(i), codeExampleActualResults.get(i));
        }
    }
}
