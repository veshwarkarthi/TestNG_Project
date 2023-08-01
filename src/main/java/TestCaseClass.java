import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCaseClass {

        WebDriver driver;


    @Test(priority=1)
    @Parameters({"username","password"})
    public void loginToAdmin(String username, String password) throws InterruptedException {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        BusinessImplementationClass cls=new BusinessImplementationClass(driver,username, password);

        cls.toPassToBusinessImplementationCls();

    }

}






