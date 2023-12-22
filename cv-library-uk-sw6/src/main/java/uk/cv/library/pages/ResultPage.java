package uk.cv.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.cv.library.utilities.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    //========================== Locators ============================//

    //verify the result 'result'
    @CacheLookup
    @FindBy(className = "search-header__title")
    WebElement resultText;

    //======================== Methods ================================//

    //verify the result 'result'
    public void verifyTheResulTextOnResultPage(String result) {
        verifyThatTextIsDisplayed(resultText, result);
        System.out.println(result);
    }
}
