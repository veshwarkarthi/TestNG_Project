import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


//object class for TestNg_Project
public class ObjectClass  {

    WebDriver dri;
    public String us;
    public String pass;


    ObjectClass(WebDriver driver, String u, String p) {

        this.dri = driver;
        this.us = u;
        this.pass = p;
        PageFactory.initElements(driver, this);

    }



    @FindBy(how = How.XPATH, using = "(//input[contains(@class,'oxd-input')])[1]")
    WebElement username;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    WebElement button;

    @FindBy(how = How.XPATH, using = "//p[text()='Time at Work']")
    WebElement loginSuccess;

    @FindBy(how = How.XPATH, using = " //p[text()='Invalid credentials']")
    WebElement loginFailure;

    public void toEnterUsernamePassword(String us, String pass) throws InterruptedException {
        username.sendKeys(us);
        password.sendKeys(pass);
        button.click();



    }
}

