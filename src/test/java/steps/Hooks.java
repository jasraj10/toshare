package steps;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void start (){openBrowserAndLaunchApplication();}

    @After
    public void end(Scenario scenario){
        closeBrowser();
    }
}
