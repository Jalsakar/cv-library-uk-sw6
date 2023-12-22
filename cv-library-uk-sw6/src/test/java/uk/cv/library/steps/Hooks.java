package uk.cv.library.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import uk.cv.library.propertyreader.PropertyReader;
import uk.cv.library.utilities.Utility;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png/jpg", scenario.getName());
        }
        closeBrowser();
    }
}
