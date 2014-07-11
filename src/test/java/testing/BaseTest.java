package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 04.07.14
 * Time: 20:15
 * To change this template use File | Settings | File Templates.
 */
public class BaseTest {
    public static WebDriver driver;




    @BeforeSuite
    public void preCondition(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();


    }
    @AfterSuite
    public void postCondition(){
        if(driver!=null)
            driver.quit();
    }
}
